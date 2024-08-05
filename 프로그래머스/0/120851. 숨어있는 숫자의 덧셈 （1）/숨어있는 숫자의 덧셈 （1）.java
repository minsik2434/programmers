class Solution {
public int solution(String my_string) {
            int answer = 0;
            char[] arr = my_string.toCharArray();
            for(int i=0; i<arr.length; i++){
               if(arr[i] >=49 && arr[i]<=57){
                   answer += Integer.parseInt(String.valueOf(arr[i]));
               }
            }
            return answer;
        }
}
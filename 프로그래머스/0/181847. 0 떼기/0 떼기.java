class Solution {
    public String solution(String n_str) {
            String answer = "";
            int index = 0;
            char[] arr = n_str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == '0') {
                    index += 1;
                }
                else{
                    break;
                }
            }
            if(index == 0){
                answer = n_str;
                return answer;
            }
            else{
                for(int i=index; i<arr.length; i++){
                    answer += arr[i];
                }
                return answer;
            }
        }
}
class Solution {
    public int solution(String[] strArr) {
            int answer = 0;
            int max = 0;
            int[] arr = new int[31];
            for(int i=0; i<strArr.length; i++){
                int length = strArr[i].length();
                arr[length]++;
            }
            for(int i=0; i<arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }
}
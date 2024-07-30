class Solution {
     public int[] solution(int[] arr) {
            int[] answer = {};
            int size = arr.length;
            int length = 1;
            while(length < size){
                length = length*2;
            }
            answer = new int[length];
            for(int i=0; i<length; i++){
                if(i>=size){
                    answer[i] = 0;
                }
                else{
                    answer[i] = arr[i];
                }
            }
            return answer;
        }
}
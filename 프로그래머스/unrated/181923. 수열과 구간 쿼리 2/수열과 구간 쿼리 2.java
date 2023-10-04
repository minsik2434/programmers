class Solution {
   public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int result = Integer.MAX_VALUE;
            int start = queries[i][0];
            int end = queries[i][1];
            int val = queries[i][2];
            for(int j=start; j<=end; j++){
                if(arr[j]>val){
                    if(arr[j]<result){
                        result = arr[j];

                    }
                }
            }
            answer[i] = result;
            if(answer[i]==Integer.MAX_VALUE){
                answer[i] = -1;
            }
        }
        return answer;
    }
}
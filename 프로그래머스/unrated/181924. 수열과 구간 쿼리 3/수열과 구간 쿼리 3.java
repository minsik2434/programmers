class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = arr;
        int tmp = 0;
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
        }
        return answer;
    }
}
import java.util.ArrayList;
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        answer = new int[start-end_num+1];
        for(int i=0; i<=start-end_num; i++){
            answer[i] = start-i;
        }
        return answer;
    }
}
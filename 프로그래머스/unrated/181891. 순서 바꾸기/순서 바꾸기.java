import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] first = {};
        int[] second = {};
        int idx = 0;

        first = Arrays.copyOfRange(num_list,n,num_list.length);
        second = Arrays.copyOfRange(num_list,0,n);
        for (int num : first){
            answer[idx++] = num;
        }
        for(int num : second){
            answer[idx++] = num;
        }
        return answer;
    }
}
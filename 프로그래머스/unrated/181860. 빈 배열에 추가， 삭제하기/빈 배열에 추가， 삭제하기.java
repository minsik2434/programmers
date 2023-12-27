import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int idx = arr[i];
            boolean idx_flag = flag[i];
            if(idx_flag){
                for(int j=0; j<idx*2; j++){
                    list.add(idx);
                }
            } else if (!idx_flag) {
                for(int j=0; j<idx; j++){
                    list.remove(list.size()-1);
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
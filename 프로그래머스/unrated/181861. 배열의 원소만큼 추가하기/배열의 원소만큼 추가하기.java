import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int idx = arr[i];
            for(int j=0; j<idx; j++){
                list.add(idx);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

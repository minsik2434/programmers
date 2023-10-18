import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++){
            int result = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(result > k){
                list.add(result);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
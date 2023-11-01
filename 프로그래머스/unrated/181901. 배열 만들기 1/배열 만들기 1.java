import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] answer = {};
        for(int i=1;i<=n; i++){
            if(i*k>n)
                break;
            list.add(i*k);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]= list.get(i);
        }
        return answer;
    }
}
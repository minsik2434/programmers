import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList();

        for(int i=l; i<=r; i++){
            int c=0;
            String s = ""+i;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='5'||s.charAt(j)=='0'){
                    c++;
                }
            }
            if(c==s.length()){
                list.add(i);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
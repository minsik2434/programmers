import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> tmp = new ArrayList();
        int i=0;
        while(arr.length>i){
            if(tmp.isEmpty()){
                tmp.add(arr[i]);
                i++;
            } else if (!tmp.isEmpty()) {
                int last = tmp.get(tmp.size()-1);
                if(last<arr[i]){
                    tmp.add(arr[i]);
                    i++;
                }
                else{
                    tmp.remove(tmp.size()-1);
                }
            }
        }
        stk = new int[tmp.size()];
        for(int j=0; j<tmp.size(); j++){
            stk[j] = tmp.get(j);
        }
        return stk;
    }
}
import java.util.List;
import java.util.ArrayList;
class Solution {
public int[] solution(int[] arr, int k) {
            int[] answer = new int[k];
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                if(list.size()==k){
                    break;
                }
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
            if(list.size()<k){
                for(int i=list.size(); i<k; i++){
                    list.add(-1);
                }
            }

            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
 public int[] solution(int[] arr, int[] delete_list) {
            int[] answer = {};
            List<Integer> list = new ArrayList<>();
            List<Integer> array = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<delete_list.length; j++) {
                    if(arr[i] == delete_list[j]) {
                        list.add(i);
                    }
                }
            }
            for(int i=0; i<arr.length; i++) {
                if(!list.contains(i)){
                    array.add(arr[i]);
                }
            }
            answer = new int[array.size()];
            for(int i=0; i<array.size(); i++) {
                answer[i] = array.get(i);
            }
            return answer;
        }
}
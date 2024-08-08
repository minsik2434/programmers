import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Solution {
public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                if(arr[i]%divisor == 0){
                    list.add(arr[i]);
                }
            }
            if(list.isEmpty()){
                answer = new int[]{-1};
            }
            else{
                answer = new int[list.size()];
                list.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                });
                for(int i=0; i<list.size(); i++){
                    answer[i] = list.get(i);
                }
            }
            return answer;
        }
}
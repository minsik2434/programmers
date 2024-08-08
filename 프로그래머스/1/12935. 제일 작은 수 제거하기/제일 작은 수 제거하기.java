import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Solution {
public int[] solution(int[] arr) {
            int[] answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for(int i=0; i<arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                    idx = i;
                }
            }
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                if(i!=idx){
                    list.add(arr[i]);
                }
            }
            
            if(list.isEmpty()){
                answer = new int[]{-1};
            }
            else{
                for(int i=0; i<list.size(); i++){
                    answer[i] = list.get(i);
                }
            }
            

            return answer;
        }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Solution {
public long solution(long n) {
            long answer = 0;
            List<Integer> list = new ArrayList<>();
            String str = "";
            while(n>0){
                int bit = (int) (n%10);
                list.add(bit);
                n = n/10;
            }
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for(int i=0; i<list.size(); i++){
                str += String.valueOf(list.get(i));
            }

            answer = Long.parseLong(str);
            return answer;
        }
}
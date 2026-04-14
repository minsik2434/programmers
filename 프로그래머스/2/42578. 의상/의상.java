import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        int tmp = 1;
        for (Integer value : map.values()) {
            tmp *= (value+1);
        }
        answer = tmp - 1;
        return answer;
    }
}
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[][] clothes) {
int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
        int sum = 1;
        for(String key: map.keySet()) {
            Integer n = map.get(key);
            sum *= n + 1;
        }
        answer = sum -1;

        return answer;
    }
}

import java.util.*;
class Solution {
 public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String op : operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);

            if (command.equals("I")) {
                //이미 있는 숫자면 개수 +1, 없으면 1로 초기화
                map.put(value, map.getOrDefault(value, 0) + 1);
            } else if (command.equals("D")) {
                if (map.isEmpty()) continue;
                int key = (value == 1) ? map.lastKey() : map.firstKey();
                int count = map.get(key);

                if (count == 1) {
                    map.remove(key);
                } else {
                    map.put(key, count - 1);
                }
            }
        }

        if (map.isEmpty()) {
            return new int[] {0,0};
        } else {
            return new int[] {map.lastKey(), map.firstKey()};
        }
    }
}
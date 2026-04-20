import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
class Solution {
public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(day);
        }
        List<Integer> array = new ArrayList<>();
        while(!queue.isEmpty()) {
            int count = 1;
            Integer poll = queue.poll();
            while(!queue.isEmpty() && queue.peek() <= poll){
                count++;
                queue.poll();
            }
            array.add(count);
        }

        return array.stream().mapToInt(i -> i).toArray();
    }
}

import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        // 최솟값을 뽑아낼 큐 (Min Heap)
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        // 최댓값을 뽑아낼 큐 (Max Heap)
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);

            if (command.equals("I")) {
                minPq.offer(value);
                maxPq.offer(value);
            } else if (command.equals("D")) {
                if (minPq.isEmpty()) continue;

                if (value == 1) {
                
                    int max = maxPq.poll();
               
                    minPq.remove(max);
                } else {
                 
                    int min = minPq.poll();
       
                    maxPq.remove(min);
                }
            }
        }

        if (minPq.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{maxPq.peek(), minPq.peek()};
        }
    }
}
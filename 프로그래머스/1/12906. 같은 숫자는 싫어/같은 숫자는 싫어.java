import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<arr.length; i++) {
            if (queue.isEmpty() || queue.peekLast() != arr[i]) {
                queue.offer(arr[i]);
            }
        }
        int[] answer = new int[queue.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}
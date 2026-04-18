import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(queue.peekLast() == arr[i]){
                continue;
            }
            queue.offer(arr[i]);
        }
        int[] answer = new int[queue.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}
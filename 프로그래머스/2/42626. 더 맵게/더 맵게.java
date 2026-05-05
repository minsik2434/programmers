import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.offer(scoville[i]);
        }

        while(queue.peek() < K) {
            Integer first = queue.poll();
            if (queue.isEmpty()) {
                return -1;
            }
            Integer second = queue.poll();
            int sum = first + second * 2;
            queue.offer(sum);
            answer++;
        }
        return answer;
    }
}
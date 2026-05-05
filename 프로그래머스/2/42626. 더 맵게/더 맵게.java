import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.offer(scoville[i]);
        }

        while(queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            Integer first = queue.poll();
            Integer second = queue.poll();
            int sum = first + second * 2;
            queue.offer(sum);
            answer++;
        }
        return answer;
    }
}
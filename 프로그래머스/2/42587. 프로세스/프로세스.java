import java.util.Collections;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //실행 우선순위를 저장하기 위한 큐를 생성
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        //실행 우선 순위 큐를 저장 [3, 2, 2, 1]
        for(int i=0; i< priorities.length; i++) {
            queue.offer(priorities[i]);
        }
        //우선순위 큐가 모두 빌때까지 순회
        while(!queue.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                //배열의 요소가 우선순위 큐의 첫 요소와 같다면 해당 요소는 우선순위가 가장 높은 요소이므로 큐에서 제거
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    
                    //i 가 location과 같다면 찾는 요소의 실행 순서이므로 결과 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
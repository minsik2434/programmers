import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0; // 현재 디스크가 작업을 마친 시간
        int count = 0; // 완료된 작업의 개수
        int jobsIdx = 0;

        // 요청 시간이 빠른 순으로 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 처리시간이 짧은 순으로 우선순위 큐 생성
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while(count < jobs.length) {

            // 현재 시간 이전에 들어온 모든 작업을 우선순위 큐에 넣음
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= time) {
                pq.offer(jobs[jobsIdx++]);
            }

            // 큐가 비어있다면 실행해야하는 작업이 없다
            if (pq.isEmpty()) {
                // 다음 작업 시간으로 이동
                time = jobs[jobsIdx][0];
            } else {
                // 큐에서 가장 짧은 실행시간을 가진 작업을 꺼냄
                int [] currentJob = pq.poll();
                // (실행 당시 시간 + 작업의 실행시간) - 작업 요청 시간
                answer += (time + currentJob[1]) - currentJob[0];
                // 현재 시간을 작업이 끝난 시간으로 이동
                time += currentJob[1];

                // 완료된 작업의 수 증가
                count++;
            }
        }
        return answer / jobs.length;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//특정 시간대에 회의실 필요 개수를 찾는다
//시작시간으로 정렬해서 회의실 개수를 센다
//시간테이블로 생각하면 됨
//회의실 사용이 가장 많을때가 필요한 회의실 수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Time> queue = new PriorityQueue<>();
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            queue.offer(new Time(Integer.parseInt(st.nextToken()),true));
            queue.offer(new Time(Integer.parseInt(st.nextToken()),false));
        }
        int current_room=0;
        int max_room=0;
        while(!queue.isEmpty()){
            Time t = queue.poll();
            if(t.isStart){
                current_room++;
                max_room = Math.max(current_room,max_room);
            }
            else{
                current_room--;
            }
        }
        System.out.println(max_room);
    }
    static class Time implements Comparable<Time>{
        int time;
        boolean isStart;
        public Time(int time, boolean isStart){
            this.time = time;
            this.isStart = isStart;
        }

        @Override
        public int compareTo(Time o) {
            return this.time - o.time;
        }
    }
}

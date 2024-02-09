import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        List<Time> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Time(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list);
        queue.offer(list.get(0).endtime);
        for(int i=1; i<num; i++){
            if(!queue.isEmpty()&&list.get(i).starttime<queue.peek()){
                queue.offer(list.get(i).endtime);
            }
            else{
                queue.poll();
                queue.offer(list.get(i).endtime);
            }
        }
        System.out.println(queue.size());

    }
    static class Time implements Comparable<Time>{
        int starttime;
        int endtime;
        public Time(int starttime, int endtime){
            this.starttime = starttime;
            this.endtime = endtime;
        }

        @Override
        public int compareTo(Time o) {
            if(starttime == o.starttime){
                return endtime-o.endtime;
            }else{
                return starttime-o.starttime;
            }
        }
    }
}

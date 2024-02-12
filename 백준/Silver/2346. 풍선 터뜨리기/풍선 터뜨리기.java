import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            deque.offerLast(new int[]{i,Integer.parseInt(st.nextToken())});
        }
        int[] value = deque.pollFirst();
        sb.append("1 ");
        int start = value[1];
        while(!deque.isEmpty()){
            if(start > 0){
                for(int i=1; i<start; i++){
                    deque.offerLast(deque.pollFirst());
                }
                value = deque.pollFirst();
                start = value[1];
                sb.append(value[0]+1).append(" ");
            }
            else{
                for(int i=1; i<-start; i++){
                    deque.offerFirst(deque.pollLast());
                }
                value = deque.pollLast();
                start = value[1];
                sb.append(value[0]+1).append(" ");
            }
        }
        System.out.println(sb);
    }
}
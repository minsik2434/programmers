import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input = br.readLine();
        String[] number = input.split(" ");
        int N = Integer.parseInt(number[0]);
        int K = Integer.parseInt(number[1]);
        for(int i=1; i<=N; i++){
            queue.offer(i);
        }
        for(int i=0; i<N-1; i++){
            for(int j=0; j<K-1; j++){
                int value = queue.poll();
                queue.offer(value);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println("<"+sb);
    }
}
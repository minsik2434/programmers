import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=num; i++){
            queue.offer(i);
        }
        for(int i=1; i<num; i++){
            long n = (long)(Math.pow(i,3)-1)%queue.size();
            for(int j=0; j<n; j++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}
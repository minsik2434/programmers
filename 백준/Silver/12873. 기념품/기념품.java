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
        int index = 1;
        while (queue.size() != 1) {
            long pow = (long) (Math.pow(index, 3) - 1);
            long mod = pow % queue.size();

            if (mod < 0) {
                mod += queue.size();
            }

            for (int i = 0; i < mod; i++) {
                queue.add(queue.poll());
            }
            queue.poll();

            index++;
        }
        System.out.println(queue.poll());
    }
}
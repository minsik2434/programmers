import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<Integer> intqueue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            intqueue.offer(i);
        }

        for(int i=0; i<num-1; i++){
            intqueue.poll();
            shuffle();
        }

        System.out.println(intqueue.poll());
    }

    public static void shuffle(){
        int value = intqueue.poll();
        intqueue.offer(value);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cardnum = Integer.parseInt(br.readLine());
        Queue<Integer> card = new LinkedList<>();
        for(int i=1; i<=cardnum; i++){
            card.offer(i);
        }
        for(int i=0; i<cardnum; i++){
            sb.append(card.poll()).append(" ");
            card.offer(card.poll());
        }
        System.out.println(sb);
    }
}
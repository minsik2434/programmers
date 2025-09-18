import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] solve = solve(n, m);
        StringBuffer sb = new StringBuffer();

        sb.append("<");
        for(int i=0; i<solve.length; i++){
            sb.append(solve[i]);
            sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }

    static int[] solve(int n, int m){
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        for(int i=0; i<=n-1; i++){
            for(int j=0; j<m-1; j++){
                queue.offer(queue.poll());
            }
            arr[i] = queue.poll();
        }

        return arr;
    }
}
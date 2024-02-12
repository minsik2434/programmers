import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxnum = Integer.parseInt(st.nextToken());
        int iter = Integer.parseInt(st.nextToken());
        int[] arr = new int[maxnum+1];
        st = new StringTokenizer(br.readLine());
        arr[0] = 0;
        arr[1] = Integer.parseInt(st.nextToken());
        for(int i=2; i<=maxnum; i++){
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<iter; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sum = arr[num2] - arr[num1-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
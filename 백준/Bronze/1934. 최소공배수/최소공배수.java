import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int answer = num1*num2/GCD(num1,num2);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);

    }
    private static int GCD(int a, int b){
        int result = a%b;
        if(result == 0){
            return b;
        }
        else{
            return GCD(b , a%b);
        }
    }
}
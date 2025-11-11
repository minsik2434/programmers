import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=1; i<n; i++){
            int value = i;
            int sum = i;
            while(value > 0){
                sum += value%10;
                value /= 10;
            }

            if(sum == n){
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}
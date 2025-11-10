import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = constructor(n);
        System.out.println(result);
    }

    static int constructor(int n){
        int result = 0;
        for(int i=1; i<n; i++){
            int sum = i;
            int value = i;
            while(value > 0) {
                sum += value%10;
                value /= 10;
            }
            
            if (sum == n){
                result = i;
                break;
            }
        }
        
        return result;
    }
}

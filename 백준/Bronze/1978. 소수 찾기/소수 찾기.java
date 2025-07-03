import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int count = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++){
            boolean b = eratosthenesSieve(arr[i]);
            if(b){
                count++;
            }
        }

        System.out.println(count);
    }
    static boolean eratosthenesSieve(int n){
        boolean[] prime = new boolean[n+1];

        for(int i=2; i<=n; i++){
            prime[i] = true;
        }

        for(int i=2; i*i <= n; i++){
            if(prime[i]){
                for(int j=i+i; j<=n; j+=i){
                    prime[j] = false;
                }
            }
        }

        return prime[n];
    }
}

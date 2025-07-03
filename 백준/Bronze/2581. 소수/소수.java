import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[n+1];
        primeSearch(prime, n);
        int sum = 0;
        int index = 0;
        for(int i=m; i<=n; i++){
            if(prime[i]){
                sum += i;
            }
        }
        for(int i=m; i<=n; i++){
            if(prime[i]){
                index = i;
                break;
            }
        }
        if(sum ==0 || index == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(index);
        }

    }

    static void primeSearch(boolean[] isPrime, int n){
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }

        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j= i+i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
}

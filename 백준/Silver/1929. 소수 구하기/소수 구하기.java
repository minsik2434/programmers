import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void eratosthenesSieve(int[] arr, int m, int n){
        for(int i = 2; i <= n; i++){
            arr[i] = i;
        }

        for(int i = 2; i <= n; i++){
            // i = 4 일때는 i=2에서 0으로 초기화 됬으니까 continue..
            if(arr[i] == 0) {
                continue;
            }
            // i = 2 이면 2 부터 n까지 2, 2+2, 4+2, 8+2 ...
            for(int j = i + i; j <= n; j += i){
                arr[j] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        eratosthenesSieve(arr, m, n);

        for(int i=m; i<=n; i++){
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}

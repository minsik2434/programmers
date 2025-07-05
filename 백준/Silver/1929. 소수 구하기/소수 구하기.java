import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] flag = new boolean[n+1];
        prime(flag, n);
        for(int i=m; i<=n; i++){
            if(flag[i]){
                System.out.println(i);
            }
        }
    }

    static void prime(boolean[] flag, int n){

        for (int i=2; i<=n; i++){
            flag[i] = true;
        }

        for(int i=2; i*i <= n; i++){
            if(flag[i]){
                for(int j=i+i; j<=n; j+=i){
                    flag[j] = false;
                }
            }
        }

    }
}

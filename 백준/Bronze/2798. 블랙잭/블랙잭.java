import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N-2; i++){
            int sum = 0;
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <=M&&sum >= max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
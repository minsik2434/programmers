import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NMString = br.readLine();
        StringTokenizer st = new StringTokenizer(NMString);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = blackJack(m, arr);
        System.out.println(result);
    }

    static int blackJack(int m, int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            int sum;
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum <= m && sum > result){
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}

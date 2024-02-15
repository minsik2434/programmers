import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++){
            String value = br.readLine();
            map.put(Integer.toString(i),value);
            map.put(value, Integer.toString(i));
        }
        for(int i=0; i<M; i++){
            String value = br.readLine();
            try {
                int num = Integer.parseInt(value);
                sb.append(map.get(Integer.toString(num))).append("\n");
            } catch (NumberFormatException e){
                sb.append(map.get(value)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
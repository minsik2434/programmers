import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int num1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num1; i++){
            int card = Integer.parseInt(st.nextToken());
            if(map.containsKey(card)){
                map.replace(card,map.get(card)+1);
            }
            else{
                map.put(card,1);
            }
        }
        int num2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num2; i++){
            int card = Integer.parseInt(st.nextToken());
            if(map.containsKey(card)){
                sb.append(map.get(card)).append(" ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
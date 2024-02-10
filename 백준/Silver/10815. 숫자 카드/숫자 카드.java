import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            map.put(st.nextToken(),1);
        }
        num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            if(map.containsKey(st.nextToken())){
                sb.append("1 ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}
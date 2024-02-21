import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Map<Integer,Integer> map = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            map.put(Integer.parseInt(st.nextToken()),i);
        }
        num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            if(map.containsKey(Integer.parseInt(st.nextToken()))){
                sb.append("1\n");
            }
            else{
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}
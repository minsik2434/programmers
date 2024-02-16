import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String , Integer> map = new HashMap<>();
        List<String> nameList = new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=0; i<N; i++){
            map.put(br.readLine(),1);
        }
        for(int i=0; i<M; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name,0) +  1);
            if(map.get(name) == 2){
                nameList.add(name);
            }
        }
        Collections.sort(nameList);
        sb.append(nameList.size()).append("\n");
        for(int i=0; i<nameList.size(); i++){
            sb.append(nameList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
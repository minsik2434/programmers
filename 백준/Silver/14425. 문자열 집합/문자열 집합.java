import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        for(int i=0; i<num1; i++){
            map.put(br.readLine(),1);
        }
        for(int i=0; i<num2; i++){
            if(map.containsKey(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}
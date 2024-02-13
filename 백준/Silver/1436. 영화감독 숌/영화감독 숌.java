import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        int i=666;
        while(list.size()<=10000){
            String str = Integer.toString(i);
            if(str.contains("666")){
                list.add(str);
            }
            i++;
        }
        System.out.println(list.get(n-1));
    }
}
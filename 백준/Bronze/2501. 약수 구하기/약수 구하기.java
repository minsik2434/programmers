import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list= new ArrayList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        list.add(0);
        for(int i=1; i<=N; i++){
            if(N%i==0){
                list.add(i);
            }
        }
        if(list.size() < K+1){
            System.out.println(0);
        }
        else{
            System.out.println(list.get(K));
        }
    }
}
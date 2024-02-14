import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String number = br.readLine();
        Integer[] arr = new Integer[number.length()];
        for(int i=0; i<number.length(); i++){
            arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<number.length(); i++){
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
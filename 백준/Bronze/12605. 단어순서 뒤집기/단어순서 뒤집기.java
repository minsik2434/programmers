import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        for(int i=0; i<num; i++){
            String str = br.readLine();
            String[] string = str.split(" ");
            for(int j=0; j<string.length; j++){
                stack.push(string[j]);
            }
            sb.append("Case #" + (i+1) + ": ");
            for(int k=0; k<string.length; k++){
                sb.append(stack.pop()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

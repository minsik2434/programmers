import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack1 = new Stack<>();
        while(true) {
            stack1.clear();
            String line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            for(int i=0; i<line.length(); i++){
                char a = line.charAt(i);
                if(a == '(' || a == '['){
                    stack1.push(a);
                }
                if(a == ')'){
                    if(stack1.isEmpty()){
                        stack1.push(a);
                    }
                    if(stack1.peek() == '('){
                        stack1.pop();
                    }
                    else break;
                }
                if(a == ']'){
                    if(stack1.isEmpty()){
                        stack1.push(a);
                    }
                    if(stack1.peek() == '['){
                        stack1.pop();
                    }
                    else break;
                }
            }
            if(stack1.isEmpty()){
                sb.append("yes").append("\n");
            }
            else{
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
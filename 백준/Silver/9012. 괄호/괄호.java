import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String st = br.readLine();
            for(int j=0; j<st.length(); j++){
                if(st.charAt(j)=='('){
                    s.push(st.charAt(j));
                }
                else if(s.isEmpty()&&st.charAt(j) == ')'){
                    s.push(st.charAt(j));
                }
                else if(s.peek() == ')'&&st.charAt(j)==')'){
                    s.push(st.charAt(j));
                }
                else if(s.peek() =='('&&st.charAt(j) ==')'){
                    s.pop();
                }
            }
            if(s.isEmpty()){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
            s.clear();
        }
        System.out.print(sb);
    }
}

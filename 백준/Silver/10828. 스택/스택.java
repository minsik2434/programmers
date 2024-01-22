import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[] stack = new int[10001];
    static int size;
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       int num = Integer.parseInt(br.readLine());
       for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop")){
                sb.append(pop()).append("\n");
            }
            else if(s.equals("size")){
                sb.append(size()).append("\n");
            }
            else if(s.equals("empty")){
                sb.append(empty()).append("\n");
            }
            else if(s.equals("top")){
                sb.append(top()).append("\n");
            }
       }
       System.out.println(sb);
    }

    public static void push(int item){
        stack[size] = item;
        size ++;
    }

    public static int pop(){
        if(size == 0){
            return -1;
        }
        int item = stack[size-1];
        size--;
        return item;
    }

    public static int size(){
        return size;
    }
    
    public static int empty(){
        if(size == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int top(){
        if(size == 0){
            return -1;
        }
        return stack[size-1];
    }
}

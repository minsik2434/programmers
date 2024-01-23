import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] queue = new int[10001];
    static int front , rear , size = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop")){
                sb.append(poll()).append("\n");
            }
            else if(s.equals("size")){
                sb.append(size()).append("\n");
            }
            else if(s.equals("empty")){
                sb.append(empty()).append("\n");
            }
            else if(s.equals("front")){
                sb.append(front()).append("\n");
            }
            else if(s.equals("back")){
                sb.append(back()).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static void push(int item){
        queue[rear++] = item;
        size++;
    }

    public static int poll() {
        if (size == 0) {
            return -1;
        }
        else{
            int result = queue[front++];
            size--;
            return result;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(front == rear){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int front(){
        if(size == 0){
            return -1;
        }
        else{
            return queue[front];
        }
    }

    public static int back(){
        if(size == 0){
            return -1;
        }
        else{
            return queue[rear-1];
        }
    }
}

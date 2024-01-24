import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] deque = new int[10001];
    static int front, size = 0;
    static int rear = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front")){
                addFirst(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop_front")){
                sb.append(removeFirst()).append("\n");
            }
            else if(s.equals("push_back")){
                addLast(Integer.parseInt(st.nextToken()));
            }
            else if(s.equals("pop_back")){
                sb.append(removeLast()).append("\n");
            }
            else if(s.equals("size")){
                sb.append(size()).append("\n");
            }
            else if(s.equals("empty")){
                sb.append(empty()).append("\n");
            }
            else if(s.equals("front")){
                sb.append(peekFirst()).append("\n");
            }
            else if(s.equals("back")){
                sb.append(peekLast()).append("\n");
            }
            
        }
        System.out.println(sb);
    }

    public static void addFirst(int item) throws IOException{
        if(front == rear){
            throw new IOException();
        }
        else{
            deque[front] = item;
            front = (front+deque.length-1)%deque.length;
            size++;
        }
    }
    
    public static int removeFirst(){
        if(size == 0){
            return -1;
        }
        else{
            int result = deque[(front+1)%deque.length];
            front = (front+1)%deque.length;
            size--;
            return result;
        }
    }

    public static void addLast(int item) throws IOException{
        if(front == rear){
            throw new IOException();
        }
        else{
            deque[rear] = item;
            rear = (rear+1)%deque.length;
            size++;
        }
    }

    public static int removeLast(){
        if(size == 0){
            return -1;
        }
        else{
            int result = deque[(rear+deque.length-1)%deque.length];
            rear = (rear+deque.length-1)%deque.length;
            size--;
            return result;
        }
    }
    
    public static int size(){
        return size;
    }

    public static int empty(){
        if(size==0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int peekFirst(){
        if(size == 0){
            return -1;
        }
        return deque[(front+1)%deque.length];
    }

    public static int peekLast(){
        if(size ==0){
            return -1;
        }
        return deque[(rear+deque.length-1)%deque.length];
    }
}

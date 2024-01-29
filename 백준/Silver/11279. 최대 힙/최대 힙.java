import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] array = new int[100001];
    static int size = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                if(size==0){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(remove()).append("\n");
                }
            }
            else{
                add(n);
            }
        }
        System.out.println(sb);
    }

    public static void add(int value){
        array[++size] = value;
        int i=size;
        while(i>1&&array[i/2]<array[i]){
            swap(i,i/2);
            i/=2;
        }
    }
    static void swap(int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static int remove(){
        int result = array[1];
        array[1] = array[size];
        array[size--] = 0;
        for(int i=1; i*2<=size;){
            if(array[i]>array[i*2]&&array[i]>array[i*2+1]){
                break;
            }
            else if(array[i*2]>array[i*2+1]){
                swap(i,i*2);
                i=i*2;
            }
            else{
                swap(i, i*2+1);
                i=i*2+1;
            }
        }
        return result;
    }
}

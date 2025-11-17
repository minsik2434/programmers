import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String[] arr2 = new String[n-1];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        for(int i=0; i<n-1; i++){
            arr2[i] = sc.next();
        }

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n-1; j++){
                if(arr[i].equals(arr2[j])){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
            }
        }
    }
}

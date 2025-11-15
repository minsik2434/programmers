import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            int solve = solve(d);
            arr[i] = solve;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    static int solve(int d){
        int max = 0;
        for(int i=0; i<=d; i++){
            int value = i + i*i;
            if(value <= d){
                max = i;
            }
        }

        return max;
    }
}


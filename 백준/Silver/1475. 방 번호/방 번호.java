import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solve = solve(n);
        System.out.println(solve);
    }

    static int solve(int n){
        int[] arr = new int[10];
        while(n > 0){
            int i = n % 10;
            arr[i] ++;
            n /= 10;
        }

        int sixAndNine = arr[6] + arr[9];
        int max = (sixAndNine + 1) / 2;

        for(int i=0; i<arr.length; i++){
            if(i == 6 || i == 9){
                continue;
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}

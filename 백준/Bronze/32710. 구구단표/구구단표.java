import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solve = solve(n);
        System.out.println(solve);
    }

    static int solve(int n){
        int result = 0;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                int value = i*j;

                if(n == i || n == j || n == value){
                    result = 1;
                }
            }
        }
        return result;
    }
}


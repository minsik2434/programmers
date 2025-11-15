import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ;i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int solve = solve(a, b, c);
            System.out.println(solve);
        }
    }

    static int solve(int a, int b, int c){
        int count = 0;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                for(int k=1; k<=c; k++){
                    if(i%j == j%k && j%k == k%i){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}


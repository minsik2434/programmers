import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solve = solve(n);
        System.out.println(solve);
    }

    static int solve(int n){
        int[] dp = new int[n+1];
        dp[1] = -1;
        dp[2] = -1;
        for(int i=3; i<=n; i++){
            if(i%5 == 0){
                dp[i] = i/5;
                continue;
            }
            if(dp[i-3] == -1){
                dp[i] = -1;
                continue;
            }
            dp[i] = dp[i-3] + 1;
        }
        return dp[n];
    }
}

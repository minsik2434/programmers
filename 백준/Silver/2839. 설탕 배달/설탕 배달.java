import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int result = bruteForce(n);
        int result = dp(n);

        System.out.println(result);

    }

    static int bruteForce(int n){
        int count = 0;
        while(n>0){
            if(n % 5 == 0){
                count += n/5;
                break;
            }
            else {
                n -= 3;
                count++;
            }

            if(n < 0){
                count = -1;
            }
        }

        return count;
    }

    static int dp(int n){
        int[] dp = new int[n+1];

        dp[0] = -1;
        dp[1] = -1;
        dp[2] = -1;
        dp[3] = 1;

        for(int i=4; i<=n; i++) {
            if (i % 5 == 0) {
                dp[i] = i / 5;
            } else if (dp[i - 3] == -1) {
                dp[i] = -1;
            } else {
                dp[i] = dp[i - 3] + 1;
            }
        }

        return dp[n];
    }

}

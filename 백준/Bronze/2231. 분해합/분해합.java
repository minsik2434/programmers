import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        for(i = 1; i<=n; i++){
            int sum = i;
            int iter = i;
            while(iter>0){
                int value = iter%10;
                sum += value;
                iter /= 10;
            }

            if(sum == n){
                break;
            }
        }

        if(i >= n){
            System.out.println(0);
        } else {
            System.out.println(i);
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result;
        if(n < 100){
            result = n;
        } else {
            result = 99;
            for(int i=100; i<n+1; i++){
                int hun = i / 100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hun - ten) == (ten - one)){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
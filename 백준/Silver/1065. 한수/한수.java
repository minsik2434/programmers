import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if(n < 100){
            count = n;
        } else {
            count = 99;

            for(int i=100; i<=n; i++){
                int hun = i/100;
                int ten = (i/10) % 10;
                int one = i%10;

                if((hun - ten) == (ten - one)){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
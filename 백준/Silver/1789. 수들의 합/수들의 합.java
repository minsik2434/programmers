import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 1;
        long sum = 0;
        int count = 0;
        while(true){
            sum += i;
            if(sum > n){
                break;
            }
            i++;
            count++;
        }

        System.out.println(count);
    }

}
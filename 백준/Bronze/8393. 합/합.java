import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        print(sumUpTo(num));
    }

    private static int sumUpTo(int num){
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        return sum;
    }

    private static void print(int number){
        System.out.println(number);
    }

}
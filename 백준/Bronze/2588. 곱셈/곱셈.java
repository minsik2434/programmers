import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int A = stdin.nextInt();
        int B = stdin.nextInt();

        int result1 = B%10 * A;
        int result2 = ((B/10)%10) * A;
        int result3 = ((B/100)%10) * A;
        int result4 = A*B;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
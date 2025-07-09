import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double A = stdin.nextDouble();
        double B =  stdin.nextDouble();
        double C =  stdin.nextDouble();
        System.out.printf("%.0f", A+B+C);
    }
}
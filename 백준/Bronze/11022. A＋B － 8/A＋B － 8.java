import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        printAllCase(num, stdIn);
    }

    private static void printAllCase(int num, Scanner stdIn) {
        for(int i = 0; i< num; i++){
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            print(a, b, i+1, a+b);
        }
    }

    static void print(int augend, int addend, int order, int sum){
        System.out.printf("Case #%d: %d + %d = %d\n", order, augend, addend ,sum);
    }
}
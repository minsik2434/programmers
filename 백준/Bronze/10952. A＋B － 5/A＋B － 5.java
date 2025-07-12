import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        while(true){
            int num1 = stdIn.nextInt();
            int num2 = stdIn.nextInt();
            if(num1 == 0 && num2 ==0){
                break;
            }
            System.out.println(num1 + num2);
        }
    }
}
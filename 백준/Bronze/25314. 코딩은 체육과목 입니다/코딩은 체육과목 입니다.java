import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int nByte = stdIn.nextInt();

        int iter = nByte/4;
        for(int i=0; i<iter; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
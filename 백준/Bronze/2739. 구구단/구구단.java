import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        multiplier(stdIn.nextInt());
    }

    static void multiplier(int number){
        for(int i=1; i<=9; i++){
            print(number, i, number*i);
        }
    }

    static void print(int number, int i, int result){
        System.out.printf("%d * %d = %d\n",number, i, result);
    }

}
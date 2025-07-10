import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int first = stdIn.nextInt();
        int second = stdIn.nextInt();
        int third = stdIn.nextInt();

        int result;
        if(first == second) {
            if (second == third) {
                result = 10000 + first * 1000;
            } else {
                result = 1000 + first * 100;
            }
        } else if(first == third){
            result = 1000 + first * 100;
        } else if(second == third){
            result = 1000 + second * 100;
        } else {
            result = max(first,second,third) * 100;
        }

        System.out.println(result);
    }

    static int max(int a, int b, int c){
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        return max;
    }
}
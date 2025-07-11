import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int amountTotal = stdIn.nextInt();
        int typeCount = stdIn.nextInt();
        int expectedTotal = calculateTotalPrice(stdIn, typeCount);
        printResult(amountTotal, expectedTotal);
    }

    static void printResult(int amountTotal, int expectedTotal){
        if(isEqualTo(amountTotal, expectedTotal)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static int calculateTotalPrice(Scanner stdIn, int count){
        int total = 0;
        for(int i=0; i<count; i++){
            int price = stdIn.nextInt();
            int quantity = stdIn.nextInt();
            total += calculateAmount(price, quantity);
        }
        return total;
    }

    static int calculateAmount(int price, int quantity){
        return price * quantity;
    }

    static boolean isEqualTo(int amountTotal ,int expected){
        return amountTotal == expected;
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int size = stdIn.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = stdIn.nextInt();
        }

        int searchNumber = stdIn.nextInt();

        print(matchedNumber(searchNumber, arr));
    }

    static int matchedNumber(int number, int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == number){
                sum ++;
            }
        }
        return sum;
    }

    static void print(int result){
        System.out.println(result);
    }

}

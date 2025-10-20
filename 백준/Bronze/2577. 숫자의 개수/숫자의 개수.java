import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[10];
        int result = A * B * C;

        while(result > 0){
            int x = result%10;
            switch(x) {
                case 0:
                    arr[0] ++;
                    break;
                case 1:
                    arr[1] ++;
                    break;
                case 2:
                    arr[2] ++;
                    break;
                case 3:
                    arr[3] ++;
                    break;
                case 4:
                    arr[4] ++;
                    break;
                case 5:
                    arr[5] ++;
                    break;
                case 6:
                    arr[6] ++;
                    break;
                case 7:
                    arr[7] ++;
                    break;
                case 8:
                    arr[8] ++;
                    break;
                case 9:
                    arr[9] ++;
                    break;
            }

            result /= 10;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
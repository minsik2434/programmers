import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += countDigit(i, d);
        }

        System.out.println(sum);
    }

    static int countDigit(int num, int search){
        int count = 0;
        while(num > 0){
            int tmp = num%10;
            if(tmp == search){
                count++;
            }
            num /= 10;
        }
        return count;
    }

}

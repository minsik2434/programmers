import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        int banana = sc.nextInt();

        int n = Math.max(apple, banana);

        for(int i=1; i<=n; i++){
            if(apple % i == 0 && banana % i == 0){
                System.out.println(i + " " + apple/i + " " + banana/i);
            }
        }
    }
}


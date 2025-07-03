import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        triangleRT(n);
    }

    static void triangleRT(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
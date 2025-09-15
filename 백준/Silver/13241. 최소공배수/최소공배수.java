import java.util.Scanner;

public class Main {
    static long gcd(long x, long y){
        if(y==0){ 
            return x;
        } else{
            return gcd(y, x % y); 
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long m = stdIn.nextInt();
        long n = stdIn.nextInt();
        long gcd = gcd(m, n);
        long lcm = m * n / gcd;
        System.out.println(lcm);
    }
}
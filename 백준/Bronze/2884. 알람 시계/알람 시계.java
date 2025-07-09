import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int h = stdIn.nextInt();
        int m = stdIn.nextInt();

        if(m < 45){
            m = 60 - 45 + m;
            if(h==0){
                h = 23;
            } else {
                h = h-1;
            }
        } else{
            m = m - 45;
        }

        System.out.println(h);
        System.out.println(m);
    }

}

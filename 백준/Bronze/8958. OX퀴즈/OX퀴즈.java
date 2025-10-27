import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String s = sc.next();
            solve(s);
        }
    }

    static void solve(String s){
        int point = 1;
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'O'){
                sum += point;
                point++;
            } else {
                point = 1;
            }
        }

        System.out.println(sum);
    }
}

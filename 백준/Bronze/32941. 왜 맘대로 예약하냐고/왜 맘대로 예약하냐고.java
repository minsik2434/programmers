import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxClass = sc.nextInt();
        int availableClass = sc.nextInt();
        int studentCount = sc.nextInt();
        int sum = 0;

        for(int i=0; i<studentCount; i++){
            int input = sc.nextInt();
            boolean isAvailable = false;
            for(int j=0; j<input; j++){
                int value = sc.nextInt();
                if(value == availableClass){
                    isAvailable = true;
                }
            }
            if (isAvailable){
                sum++;
            }
        }

        if(sum == studentCount){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


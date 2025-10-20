import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++){
            int num = s.charAt(i) - '0';
            arr[num]++;
        }

        int sixAndNine = arr[6] + arr[9];
        int max = (sixAndNine + 1) / 2;
        for(int i=0; i<arr.length; i++){
            if(i == 6){
                continue;
            }
            if (i == 9){
                continue;
            }

            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
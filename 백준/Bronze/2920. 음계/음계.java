import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int ascendingCount = 0;
        int descendingCount = 0;

        int max = 0;
        int min = 9;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ascendingCount++;
            }
            if (arr[i] < min){
                min = arr[i];
                descendingCount++;
            }
        }

        if(ascendingCount == 8){
            System.out.println("ascending");
        } else if (descendingCount == 8){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
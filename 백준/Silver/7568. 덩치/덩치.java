import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i=0; i<num; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i=0; i<num; i++){
            int rating = 0;
            for(int j=0; j<num; j++){
                if(j==i){
                    continue;
                }

                if(arr[i][0] < arr[j][0]){
                    if(arr[i][1] < arr[j][1]){
                        rating++;
                    }
                }
            }
            System.out.println(rating+1);
        }

    }
}
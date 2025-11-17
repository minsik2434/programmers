import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sec = 0;
        int bossHP = 0;
        for(int i=0; i<3; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        bossHP = sc.nextInt();

        while(bossHP > 0){
            if(sec % arr[0][0] == 0){
                bossHP -= arr[0][1];
            }
            if (sec % arr[1][0]  == 0){
                bossHP -= arr[1][1];
            }
            if (sec % arr[2][0] == 0){
                bossHP -= arr[2][1];
            }
            sec++;
        }
        System.out.println(sec - 1);
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();
        boolean[][] paper = new boolean[101][101];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    paper[j][k] = true;
                }
            }
        }

        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(paper[i][j]){
                    count++;
                }
            }
        }


        System.out.println(count);

    }
}
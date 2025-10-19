import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] paper = new boolean[101][101];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            paint(x, y, paper);
        }
        int result = totalExtend(paper);
        System.out.println(result);
    }

    static void paint(int x, int y, boolean[][] paper){
        for(int i=x; i<x+10; i++){
            for(int j=y; j<y+10; j++){
                paper[i][j] = true;
            }
        }
    }

    static int totalExtend(boolean[][] paper){
        int count = 0;
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(paper[i][j]){
                    count++;
                }
            }
        }

        return count;
    }
}
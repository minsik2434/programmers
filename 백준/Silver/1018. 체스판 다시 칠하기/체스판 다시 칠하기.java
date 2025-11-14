import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] chess = new char[n][m];
        int min = Integer.MAX_VALUE;
        sc.nextLine();

        for(int i=0; i<n; i++){
            String string = sc.next();
            for(int j=0; j<m; j++){
                chess[i][j] = string.charAt(j);
            }
        }

        for(int i=0; i<n-7; i++){
            for(int j=0; j<m-7; j++){
                int result = minPaint(i, j, chess);
                if(result < min){
                    min = result;
                }
            }
        }

        System.out.println(min);
    }

    static int minPaint(int cor, int row, char[][] chess){
        char tmp = chess[cor][row];
        int count = 0;
        for(int i=cor; i<cor+8; i++){
            for(int j=row; j<row+8; j++){
                if(chess[i][j] != tmp){
                    count++;
                }

                if(tmp == 'B'){
                    tmp = 'W';
                } else {
                    tmp = 'B';
                }
            }

            if(tmp == 'B'){
                tmp = 'W';
            } else {
                tmp = 'B';
            }
        }
        return Math.min(count, 64-count);
    }
}

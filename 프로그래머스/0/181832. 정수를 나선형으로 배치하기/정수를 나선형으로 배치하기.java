class Solution {
public int[][] solution(int n) {
            int[][] answer = new int[n][n];
            int row = 0;
            int col = 0;
            int idx = 1;
            int direction = 0;
            while(idx <= n*n){
                answer[row][col] = idx++;
                if(direction == 0){
                    if(col < n-1 && answer[row][col+1] == 0){
                        col++;
                    }
                    else{
                        direction = 1;
                        row++;
                    }
                }
                else if(direction == 1){
                    if(row < n-1 && answer[row+1][col] == 0){
                        row++;
                    }
                    else{
                        direction = 2;
                        col--;
                    }
                }
                else if(direction == 2){
                    if(col>0 && answer[row][col-1] == 0){
                        col--;
                    }
                    else{
                        direction = 3;
                        row--;
                    }
                }
                else if(direction == 3){
                    if(row>0 && answer[row-1][col] == 0){
                        row--;
                    }
                    else{
                        direction=0;
                        col++;
                    }
                }
            }
            return answer;
        }
}
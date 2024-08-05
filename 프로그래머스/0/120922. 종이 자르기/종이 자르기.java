class Solution {
public int solution(int M, int N) {
            int answer = 0;
            int row = M;
            int col = N;
            int result1 = 0;
            int result2= 0;
            while (row > 1){
               result1++;
               row--;
            }
            while(col >1){
                result2++;
                col--;
            }
            answer = result1 + result2*M;
            return answer;
        }
}
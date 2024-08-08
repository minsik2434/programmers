class Solution {
    public int solution(int left, int right) {
            int answer = 0;
            int sum = 0;
            for(int i=left; i<=right; i++){
                int cd = 0;
                for(int j=1; j<i; j++){
                    if(i%j==0){
                        cd++;
                    }
                }
                if(cd%2 == 0){
                    sum = sum+i;
                }
                else{
                    sum = sum-i;
                }
            }
            answer = Math.abs(sum);
            return answer;
        }
}
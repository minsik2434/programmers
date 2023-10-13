class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int i=0;
        int count = 0;
        int k = n;
        while(k!=1){
            if(k%2 == 0){
                k=k/2;
            }
            else{
                k=3*k+1;
            }
            count++;
        }
        answer = new int[count+1];
        while(n!=1){
            answer[i] = n;
            if(n%2 == 0){
                n=n/2;

            }
            else{
                n=3*n+1;
            }
            i++;
        }
        answer[i] = 1;
        return answer;
    }
}
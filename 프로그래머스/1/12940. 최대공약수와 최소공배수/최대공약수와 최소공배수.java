class Solution {
public int[] solution(int n, int m) {
            int[] answer = new int[2];
            int gcd;
            if(n>m){
                gcd = gcd(n,m);
            }
            else {
                gcd = gcd(m,n);
            }
            answer[0] = gcd;
            answer[1] = (n*m)/gcd;

            return answer;
        }
        int gcd(int a, int b){
            if(a%b==0){
                return b;
            }
            else{
                return gcd(b,a%b);
            }
        }
}
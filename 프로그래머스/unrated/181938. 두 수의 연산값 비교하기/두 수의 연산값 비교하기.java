class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String bf1;
        bf1 = String.valueOf(a)+String.valueOf(b);
        if(Integer.parseInt(bf1)>(a*b*2)){
            answer = Integer.parseInt(bf1);
        }
        else if(Integer.parseInt(bf1)<(a*b*2)){
            answer = a*b*2;
        }
        else {
            answer = Integer.parseInt(bf1);
        }
        return answer;
    }
}
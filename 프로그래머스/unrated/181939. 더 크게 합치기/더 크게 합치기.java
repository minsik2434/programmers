class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String bf1, bf2;
        bf1 = String.valueOf(a)+String.valueOf(b);
        bf2 = String.valueOf(b)+String.valueOf(a);
        if(Integer.parseInt(bf1)<Integer.parseInt(bf2)){
            answer = Integer.parseInt(bf2);
        }
        else if(Integer.parseInt(bf1)>Integer.parseInt(bf2)){
            answer = Integer.parseInt(bf1);
        }
        else{
            answer = Integer.parseInt(bf2);
        }
        return answer;
    }
}
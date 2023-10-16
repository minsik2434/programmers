class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(int i=0; i<number.length(); i++){
            String s = String.valueOf(number.charAt(i));
            int n = Integer.parseInt(s);
            sum += n;
        }
        answer = sum%9;
        return answer;
    }
}
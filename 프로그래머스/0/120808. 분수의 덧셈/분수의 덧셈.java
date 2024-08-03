class Solution {
    public int[] solution(int number1, int denom1, int number2, int denom2) {
            int[] answer = new int[2];
            int denom = denom1*denom2;
            number1 = number1*denom2;
            number2 = number2*denom1;
            int number = number1+number2;
            int gdb = getGdb(number, denom);
            answer[0] = number/gdb;
            answer[1] = denom/gdb;
            return answer;
        }

        public int getGdb(int number, int denom) {
            if(number > denom) {
                if(number % denom == 0) {
                    return denom;
                }
                return getGdb(denom , number%denom);
            }
            else{
                if(denom%number == 0) {
                    return number;
                }
                return getGdb(number , denom%number);
            }
        }
}
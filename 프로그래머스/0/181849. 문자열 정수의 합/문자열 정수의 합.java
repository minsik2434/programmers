class Solution {
    public int solution(String num_str) {
            int length = num_str.length();
            char[] charArray = num_str.toCharArray();
            int sum = 0;
            for(int i=0; i<length; i++){
                sum+= Integer.parseInt(String.valueOf(charArray[i]));
            }

            return sum;
        }
}
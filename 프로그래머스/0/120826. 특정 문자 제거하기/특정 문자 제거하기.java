class Solution {
    public String solution(String my_string, String letter) {
            String answer = "";
            char[] charArray = my_string.toCharArray();
            for (char c : charArray) {
                if(!String.valueOf(c).equals(letter)){
                    answer+=c;
                }
            }

            return answer;
        }
}
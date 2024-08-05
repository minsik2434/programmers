
class Solution {
public String solution(String my_string, int num1, int num2) {
            String answer = "";
            char temp;
            char[] chars= my_string.toCharArray();
            temp = chars[num1];
            chars[num1] = chars[num2];
            chars[num2] = temp;
            answer = String.copyValueOf(chars);
            return answer;
        }
}
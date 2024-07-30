class Solution {
public String solution(String myString) {
            String answer = "";
            char[] chars = myString.toCharArray();
            for(int i=0; i<chars.length; i++) {
                if(chars[i] >= 'a' && chars[i] <= 'k') {
                    chars[i] = 'l';
                }
            }
            answer = new String(chars);
            return answer;
        }
}
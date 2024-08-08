class Solution {
public boolean solution(String s) {
            boolean answer = true;
            char[] arr = s.toCharArray();
            if(s.length()==4 || s.length()==6){
                for (char c : arr) {
                    if (c > 57 || c < 48) {
                        answer = false;
                        break;
                    }
                }
            }
            else {
                answer = false;
            }
            return answer;
        }
}
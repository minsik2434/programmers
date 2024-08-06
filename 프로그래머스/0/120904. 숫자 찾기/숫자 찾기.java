class Solution {
public int solution(int num, int k) {
            int answer = -1;
            char[] chars = String.valueOf(num).toCharArray();
            char a = String.valueOf(k).toCharArray()[0];
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == a) {
                    answer = i+1;
                    break;
                }
            }
            return answer;
        }
}
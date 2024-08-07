import java.util.*;

public class Solution {
    public int solution(int n) {
            int answer = 0;
            int sum = 0;
            char[] chars = String.valueOf(n).toCharArray();
            for (char aChar : chars) {
                sum += Integer.parseInt(String.valueOf(aChar));
            }
            answer = sum;
            return answer;
        }
}
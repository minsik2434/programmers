import java.util.*;
class Solution {
public String solution(String my_string) {
            String answer = "";
            char[] string = my_string.toLowerCase().toCharArray();
            Arrays.sort(string);
            answer = new String(string);
            System.out.println("string = " + answer);
            return answer;
        }
}
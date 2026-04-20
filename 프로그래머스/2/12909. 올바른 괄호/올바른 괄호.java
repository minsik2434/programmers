import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();

        for(int i=0; i<charArray.length; i++) {
            if (charArray[i] == '(') {
                stack.push(charArray[i]);
            } else {
                if (stack.isEmpty() || stack.peekLast() == ')') {
                    stack.push(charArray[i]);
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}
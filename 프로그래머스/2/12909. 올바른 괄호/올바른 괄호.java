import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //스택을 이용해 닫는 괄호인 경우 스택의 최상단의 여는 괄호를 빼는 식으로 괄호 짝을 확인
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();

        for(int i=0; i<charArray.length; i++) {
            // 괄효가 여는 괄호면 스택에 추가
            if (charArray[i] == '(') {
                stack.push(charArray[i]);
            } else {
                //괄호가 닫는 괄호이면서 스택이 비어있다면 올바르지 않은 괄호 조합이므로 바로 false를 리턴
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    // 스택의 최상단이 여는괄호이면 해당 요소를 뺌
                    stack.pop();
                }
            }
        }
        //스택이 모두 비어있다면 올바르게 괄호가 짝 지어짐
        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}
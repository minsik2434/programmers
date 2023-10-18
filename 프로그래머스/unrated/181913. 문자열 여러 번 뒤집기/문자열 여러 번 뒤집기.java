import java.util.Stack;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        System.out.println(my_string);
        char[] result = my_string.toCharArray();
        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            Stack<Character> s = new Stack<>();
            for(int j=start; j<=end; j++){
                s.push(answer.charAt(j));
            }
            for(int j=start; j<=end; j++){
                result[j] = s.pop();
            }
            answer = String.valueOf(result);
        }
        return answer;
    }
}
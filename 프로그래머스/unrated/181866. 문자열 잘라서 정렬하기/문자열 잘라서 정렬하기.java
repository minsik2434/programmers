import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
class Solution {
public String[] solution(String myString) {
        String[] answer = {};
        String[] token = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(token);
        for(int i=0; i<token.length; i++){
            if(!Objects.equals(token[i], "")){
                list.add(token[i]);
            }
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
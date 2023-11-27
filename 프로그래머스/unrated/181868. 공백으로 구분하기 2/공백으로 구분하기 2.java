import java.util.ArrayList;
import java.util.Objects;
class Solution {
 public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        String[] token = my_string.split(" ");
        for(int i=0; i<token.length; i++){
            if(!Objects.equals(token[i], "")){
                list.add(token[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
import java.util.*;
class Solution {
public String[] solution(String[] picture, int k) {
            String[] answer = {};
            answer = new String[picture.length*k];
            List<String> list = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            for(int i=0; i<picture.length; i++) {
                String result="";
                char[] chars = picture[i].toCharArray();
                for(int j=0; j<chars.length; j++){
                    for(int q=0; q<k; q++){
                        result += chars[j];
                    }
                }
                list.add(result);
            }
            for(int i=0; i<list.size(); i++) {
                for(int j=0; j<k; j++){
                    list2.add(list.get(i));
                }
            }
            for(int i=0; i<list2.size(); i++) {
                answer[i] = list2.get(i);
            }
            return answer;
        }
}
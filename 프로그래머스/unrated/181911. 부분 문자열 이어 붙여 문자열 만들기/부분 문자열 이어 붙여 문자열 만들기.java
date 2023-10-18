import java.util.ArrayList;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<my_strings.length; i++){
            int start = parts[i][0];
            int end = parts[i][1];
            list.add(my_strings[i].substring(start, end+1));
        }
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}
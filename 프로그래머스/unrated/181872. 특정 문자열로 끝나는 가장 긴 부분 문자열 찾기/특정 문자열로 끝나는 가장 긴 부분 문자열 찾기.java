import java.util.ArrayList;
class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        ArrayList<String>list = new ArrayList<>();
        for(int i=0; i<myString.length();i++){
            if(myString.substring(0,i+1).endsWith(pat)) {
                list.add(myString.substring(0, i + 1));
            }
        }
        answer = list.get(list.size()-1);
        return answer;
    }
}
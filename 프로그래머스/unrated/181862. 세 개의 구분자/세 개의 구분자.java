import java.util.ArrayList;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        String str = myStr.replaceAll("[abc]",",");
        String[] token = str.split(",");

        for(int i=0; i<token.length; i++){
            if(!token[i].equals("")){
                list.add(token[i]);
            }
        }
        if(list.isEmpty()){
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else{
            answer = new String[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}
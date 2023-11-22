import java.util.ArrayList;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < myString.length(); i++){
            if(myString.substring(0,i+1).endsWith(pat)){
                answer++;
            }
        }
        return answer;
    }
}
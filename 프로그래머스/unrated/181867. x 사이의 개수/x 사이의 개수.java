import java.util.ArrayList;
class Solution {
public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        String[] s_arr = myString.split("x");
        for(int i=0; i<s_arr.length; i++){
            list.add(s_arr[i].length());
        }
        if(myString.endsWith("x")){
            list.add(0);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
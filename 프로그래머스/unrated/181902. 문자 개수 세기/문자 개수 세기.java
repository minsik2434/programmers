class Solution {
 public int[] solution(String my_string) {
        int[] answer = {0};
        answer = new int[52];
        int[] ranswer = new int[123];
        for(int i=0; i<my_string.length(); i++){
            for(int j=65; j<123; j++){
                if(((int)my_string.charAt(i) == j)&&j<91){
                    ranswer[j]++;
                    break;
                }
                else if(((int)my_string.charAt(i) == j)&&j>96){
                    ranswer[(j-6)]++;
                    break;
                }
            }
        }
        for(int i=0; i<answer.length; i++){
            answer[i] = ranswer[i+65];
        }

        return answer;
    }
}
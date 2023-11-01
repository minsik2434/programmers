class Solution {
 public String solution(String my_string, int[] indices) {
        String answer = "";
        for( int i=0; i<my_string.length(); i++){
            boolean include = false;
            for(int j=0; j<indices.length; j++){
                if(indices[j] == i){
                    include = true;
                    break;
                }
            }
            if(!include){
                answer+=my_string.charAt(i);
            }
        }

        return answer;
    }
}
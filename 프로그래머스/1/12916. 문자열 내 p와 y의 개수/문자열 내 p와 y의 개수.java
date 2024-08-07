class Solution {
    boolean solution(String s) {
            boolean answer = true;

            String str = s.toLowerCase();
            char[] chars = str.toCharArray();
            int pCount =0;
            int yCount =0;
            for(int i=0; i<chars.length; i++){
                if(chars[i] == 'p'){
                    pCount++;
                } else if (chars[i] == 'y') {
                    yCount++;
                }
            }
            if(pCount != yCount){
                answer = false;
            }

            return answer;
        }
}
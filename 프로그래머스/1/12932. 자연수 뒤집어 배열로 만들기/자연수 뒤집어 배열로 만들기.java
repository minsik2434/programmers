class Solution {
   public int[] solution(long n) {
            int[] answer = {};
            char[] chars = String.valueOf(n).toCharArray();
            answer = new int[chars.length];
            int j=0;
            for(int i=chars.length-1; i>=0; i--){
                answer[j++] = Integer.parseInt(String.valueOf(chars[i]));
            }
            return answer;
        }
}
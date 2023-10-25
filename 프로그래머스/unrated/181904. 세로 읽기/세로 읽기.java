class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] string = new String[my_string.length()/m];
        int k=0;
        for(int i=0; i<my_string.length(); i=i+m){
            string[k++] = my_string.substring(i,i+m);
        }
        for(int i=0; i<string.length; i++){
            answer += string[i].charAt(c-1);
        }
        return answer;
    }
}
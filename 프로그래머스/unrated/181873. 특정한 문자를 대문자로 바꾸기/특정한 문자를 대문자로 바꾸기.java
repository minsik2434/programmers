class Solution {
    public String solution(String myString, String alp) {
        String answer = "";
        char[] string = myString.toCharArray();
        char s = alp.charAt(0);
        for(int i=0; i<string.length; i++){
            if((string[i]==s)){
                string[i] = Character.toUpperCase(string[i]);
            }
        }
        answer = new String(string);
        return answer;
    }
}
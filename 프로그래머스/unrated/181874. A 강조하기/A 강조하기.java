class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] string = myString.toCharArray();
        for(int i=0; i<string.length; i++){
            if((string[i]=='a')||(string[i] == 'A')){
                string[i] = Character.toUpperCase(string[i]);

            }
            else{
                string[i] = Character.toLowerCase(string[i]);
            }
        }
        answer = new String(string);
        return answer;
    }
}
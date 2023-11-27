class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] str = myString.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i] == 'A'){
                str[i] = 'B';
            }
            else if(str[i] == 'B'){
                str[i] = 'A';
            }
        }
        String result = String.valueOf(str);
        if(result.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}
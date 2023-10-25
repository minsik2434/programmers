class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String t = my_string.substring(s,e+1);
        String result="";
        for(int i=t.length()-1; i>=0; i--){
            result += t.charAt(i);
        }
        System.out.println(result);
        answer+=my_string.substring(0,s)+result+my_string.substring(e+1);
        return answer;
    }
}
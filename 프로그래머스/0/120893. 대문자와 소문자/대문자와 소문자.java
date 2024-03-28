class Solution {
    public String solution(String my_string) {
            char[] charArray = my_string.toCharArray();
            StringBuilder result = new StringBuilder();
            int length = my_string.length();
            for(int i=0; i<length; i++){
                if(64<=charArray[i]&& charArray[i]<91){
                    result.append(String.valueOf(charArray[i]).toLowerCase());
                }
                else {
                    result.append(String.valueOf(charArray[i]).toUpperCase());
                }
            }
            return String.valueOf(result);
        }
}
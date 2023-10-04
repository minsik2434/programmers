class Solution {
    public int solution(int n, String control) {
        int result = n;
        String a;
        for(int i=0; i<control.length(); i++){
            a = String.valueOf(control.charAt(i));
            if(a.equals("w")){
                result = result+1;
            }
            else if(a.equals("s")){
                result = result-1;
            }
            else if(a.equals("d")){
                result = result+10;
            }
            else{
                result = result-10;
            }
        }
        return result;
    }
}
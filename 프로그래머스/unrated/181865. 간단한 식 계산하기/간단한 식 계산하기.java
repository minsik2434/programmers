class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] token = binomial.split(" ");
        if(token[1].equals("+")){
            answer = Integer.parseInt(token[0])+Integer.parseInt(token[2]);
        }
        else if(token[1].equals("-")){
            answer = Integer.parseInt(token[0])-Integer.parseInt(token[2]);
        }
        else if(token[1].equals("*")){
            answer = Integer.parseInt(token[0])*Integer.parseInt(token[2]);
        }
        return answer;
    }
}
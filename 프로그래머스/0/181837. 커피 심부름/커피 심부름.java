class Solution {
    public int solution(String[] order) {
            int answer = 0;
            int americano = 0;
            int cafelatte = 0;
            for(int i = 0; i < order.length; i++){
                String s = order[i];
                if(s.contains("americano")){
                    americano++;
                }
                else if(s.contains("cafelatte")){
                    cafelatte++;
                }
                else if(s.equals("anything")){
                    americano++;
                }
            }
            answer = americano*4500 + cafelatte*5000;
            return answer;
        }
}
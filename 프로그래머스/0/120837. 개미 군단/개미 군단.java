class Solution {
 public int solution(int hp) {
            int answer = 0;
            while(hp>0){
                if(hp/5 >= 1){
                    answer += hp/5;
                    hp = hp%5;
                    System.out.println("hp = " + hp);
                }
                else if(hp/3 >= 1 && hp/5 < 1){
                    answer += hp/3;
                    hp = hp%3;
                }
                else{
                    answer += hp;
                    hp=0;
                }
            }
            return answer;
        }
}
class Solution {
public int solution(String[] babbling) {
            int answer = 0;
            for(int i=0; i<babbling.length; i++) {
                boolean check = true;
                String ayaRemove = babbling[i].replace("aya" , ".");
                String yeeRemove = ayaRemove.replace("ye" , ".");
                String wooRemove = yeeRemove.replace("woo" , ".");
                String maRemove = wooRemove.replace("ma" , ".");
                char[] chars = maRemove.toCharArray();
                for(int j=0; j<chars.length; j++){
                   if(!(chars[j] == '.')){
                       check = false;
                   }
                }
                if(check){
                    answer++;
                }
            }
            return answer;
        }
}
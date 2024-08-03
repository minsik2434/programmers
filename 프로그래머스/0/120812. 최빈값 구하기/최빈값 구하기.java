class Solution {
public int solution(int[] array) {
            int answer = 0;
            int[] tmp = new int[1000];
            int max = 0;
            int number = 0;
            for (int j : array) {
                tmp[j]++;
            }
            for(int i=0; i<tmp.length; i++) {
                if(tmp[i] > max) {
                    max = tmp[i];
                    number = i;
                }
            }
            answer = number;
            for(int i=0; i<tmp.length; i++) {
                if(i == number)
                    continue;
                if(tmp[i] == max) {
                    answer = -1;
                }
            }


            return answer;
        }
}
class Solution {
    public int[] solution(int[] answers) {
int[] abase = new int[]{1,2,3,4,5};
        int[] bbase = new int[]{2,1,2,3,2,4,2,5};
        int[] cbase = new int[]{3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if (abase[i % abase.length] == answers[i]) count[0]++;
            if (bbase[i % bbase.length] == answers[i]) count[1]++;
            if (cbase[i % cbase.length] == answers[i]) count[2]++;
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        int size = 0;
        for(int i = 0; i < 3; i++) {
            if(count[i] == max) {
                size++;
            }
        }

        int[] answer = new int[size];
        int k = 0;
        for(int i = 0; i < 3; i++) {
            if (count[i] == max){
                answer[k++] = i + 1;
            }
        }
        return answer;
    }
}
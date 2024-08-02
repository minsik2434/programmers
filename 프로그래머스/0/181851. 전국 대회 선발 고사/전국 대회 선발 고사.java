import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
            int answer = 0;
            List<int[]> pairs = new ArrayList<>();
            for (int i = 0; i < rank.length; i++) {
                if(attendance[i]) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = rank[i];
                    pairs.add(arr);
                }
            }
            pairs.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(o1[1], o2[1]);
                }
            });
            answer = pairs.get(0)[0]*10000 + 100*pairs.get(1)[0] + pairs.get(2)[0];

            return answer;
        }
}
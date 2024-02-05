import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        LinkedList<int[]> queue = new LinkedList<>();
        for(int i=0; i<testCase; i++){
            queue.clear();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                queue.offer(new int[] { j, Integer.parseInt(st.nextToken())});
            }
            int count = 0;
            while(!queue.isEmpty()){
                int[] first = queue.poll();
                boolean isMaxPriority = true;

                for(int j=0; j<queue.size(); j++){
                    if(first[1]<queue.get(j)[1]){
                        queue.offer(first);
                        for(int k=0; k<j; k++){
                            queue.offer(queue.poll());
                        }
                        isMaxPriority = false;
                        break;
                    }
                }
                if(isMaxPriority == false){
                    continue;
                }
                count++;
                if(first[0] == m){
                    break;
                }

            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
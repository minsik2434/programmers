import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        List<Point> list = new ArrayList<>();
        for(int i=0; i<number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            list.add(new Point(num1,num2));
        }
        Collections.sort(list);
        for(int i=0; i<number; i++){
            sb.append(list.get(i).x).append(" ").append(list.get(i).y).append("\n");
        }
        System.out.println(sb);
    }
    static private class Point implements Comparable<Point>{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x){
                return this.y-o.y;
            }
            return this.x-o.x;
        }
    }
}
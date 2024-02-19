import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age,name,i));
        }

        Collections.sort(list);
        for(int i=0; i<num; i++){
            System.out.println(list.get(i).age + " " +list.get(i).name);
        }
    }
    static class Member implements Comparable<Member>{
        int age;
        String name;
        int order;
        public Member(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public int compareTo(Member o) {
            if(this.age == o.age){
                return this.order - o.order;
            }
            return this.age - o.age;
        }
    }
}
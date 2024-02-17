import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            String str = br.readLine();
            if(!list.contains(str)){
                list.add(str);
            }
        }
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length();
                }
            }
        };
        Collections.sort(list, comparator);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
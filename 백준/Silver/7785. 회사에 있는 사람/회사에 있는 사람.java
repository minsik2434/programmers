import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> remaining = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String name = sc.next();
            String log = sc.next();

            if(log.equals("enter")){
                remaining.add(name);
            } else{
                remaining.remove(name);
            }
        }

        LinkedHashSet<String> collect = remaining.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (String s : collect) {
            System.out.println(s);
        }
    }

}
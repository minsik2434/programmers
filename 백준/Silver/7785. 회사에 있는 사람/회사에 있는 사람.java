import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> remaining = new LinkedHashSet<>();
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

        ArrayList<String> result = new ArrayList<>(remaining);
        result.sort(Comparator.reverseOrder());

        for (String s : result) {
            System.out.println(s);
        }
    }

}
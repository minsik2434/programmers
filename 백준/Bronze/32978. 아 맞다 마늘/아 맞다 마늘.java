import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] target = new String[n];
        String[] lookup = new String[n-1];
        for(int i=0; i<n; i++){
            target[i] = sc.next();
        }
        for(int i=0; i<n-1; i++){
            lookup[i] = sc.next();
        }

        int indexNotOnArray = findIndexNotOnArray(target, lookup);

        System.out.println(target[indexNotOnArray]);
    }

    static int findIndexNotOnArray(String[] target, String[] lookup){
        int result = -1;
        for(int i=0; i<target.length; i++){
            int count = 0;
            for(int j=0; j<lookup.length; j++){
                if (target[i].equals(lookup[j])){
                    count++;
                    break;
                }
            }
            if (count == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}


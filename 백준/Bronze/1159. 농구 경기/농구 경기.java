import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[26];
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int first = s.charAt(0) - 'a';
            arr[first]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 5){
                sb.append((char) (i + 'a'));
            }
        }
        if(sb.length() == 0){
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }

    }
}
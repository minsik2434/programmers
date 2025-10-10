import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            String s = sc.next();
            boolean group = isGroup(s);
            if(group){
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean isGroup(String s){
        char[] charArray = s.toCharArray();

        for(int i=1; i<charArray.length; i++){
            if(charArray[i] != charArray[i-1]){
                for(int j=i-1; j>=0; j--){
                    if(charArray[i] == charArray[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

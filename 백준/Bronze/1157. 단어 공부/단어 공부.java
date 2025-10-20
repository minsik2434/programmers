import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            char upperCase = Character.toUpperCase(s.charAt(i));
            arr[upperCase - 'A']++;
        }

        int max = 0;
        int maxIndex = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == max){
                count ++;
            }
        }

        if(count > 1){
            System.out.println("?");
        } else {
            char a = (char) (maxIndex + 'A');
            System.out.println(a);
        }
    }
}
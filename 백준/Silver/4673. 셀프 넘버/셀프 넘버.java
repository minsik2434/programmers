public class Main {
    public static void main(String[] args) {

        boolean[] arr = new boolean[20000];

        for(int i=1; i<10001; i++){
            int num = i;
            int sum = i;

            while(num > 0){
                int a = num %10;
                sum += a;
                num /= 10;
            }

            arr[sum] = true;
        }


        for(int i=1; i<10001; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}
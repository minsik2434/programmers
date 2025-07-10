import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int cHour = stdIn.nextInt();
        int cMinute = stdIn.nextInt();
        int rMinute = stdIn.nextInt();

        int resultMinute;
        int resultHour;
        if(cMinute + rMinute > 59){
            int addHour = (cMinute + rMinute)/60;
            resultMinute = (cMinute + rMinute)%60;
            if(cHour + addHour > 23){
                resultHour = (cHour + addHour)%24;
            } else {
                resultHour = cHour + addHour;
            }
        } else {
            resultMinute = (cMinute + rMinute);
            resultHour = cHour;
        }

        System.out.println(resultHour + " " + resultMinute);
    }
}
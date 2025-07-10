import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int currentHour = stdIn.nextInt();
        int currentMinute = stdIn.nextInt();
        int cookDuration = stdIn.nextInt();

        Time time = calculateCookingArrivalTime(currentHour, currentMinute, cookDuration);
        print(time);
    }

    private static Time calculateCookingArrivalTime(int currentHour, int currentMinute, int cookingDuration){
        int totalMinute = currentHour * 60 + currentMinute + cookingDuration;
        int arrivedHour = (totalMinute / 60) % 24;
        int arrivedMinute = totalMinute % 60;
        return new Time(arrivedHour, arrivedMinute);
    }

    private static void print(Time time) {
        System.out.printf("%d %d", time.getHour(), time.getMinute());
    }
    private static class Time{
        private int hour;
        private int minute;

        public Time(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }
    }
}
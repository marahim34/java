public class Chapter2P12DispalyingTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = currentSecond / 60;

        long currentMinute = totalMinutes / 60;

        long currentHour = currentMinute % 24;

        System.out.println(currentHour + " : " + currentMinute + " : " + currentSecond);
    }
}

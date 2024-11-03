import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        try {
            Scanner userInput = new Scanner(System.in);
            int userMonth = userInput.nextInt() - 1;
            int userDay = userInput.nextInt();
            int userYear = userInput.nextInt();

            calendar.set(Calendar.YEAR, userYear);
            calendar.set(Calendar.MONTH, userMonth);
            calendar.set(Calendar.DAY_OF_MONTH, userDay);

            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

            String daysOfWeek = dayFormat.format(calendar.getTime()).toUpperCase();
            System.out.println(daysOfWeek);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("An error occurred while reading the input");
        }

    }
}

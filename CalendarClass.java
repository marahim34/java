import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date is and time: " + calendar.getTime());

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        System.out.println(month + "-" + day + "-" + year);

        int time = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(time);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter month from 1-12");
        int userMonth = userInput.nextInt() - 1;
        int userDay = userInput.nextInt();
        int userYear = userInput.nextInt();

        calendar.set(Calendar.YEAR, userYear);
        calendar.set(Calendar.MONTH, userMonth);
        calendar.set(Calendar.DAY_OF_MONTH, userDay);

        System.out.println("User provided day" + calendar.getTime());

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

        String daysOfWeek = dayFormat.format(calendar.getTime());
        System.out.println(daysOfWeek);

    }
}

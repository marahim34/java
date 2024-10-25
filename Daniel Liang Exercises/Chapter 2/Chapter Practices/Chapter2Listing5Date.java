import java.util.Scanner;

public class Chapter2Listing5Date {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a digit for seconds: ");
        int seconds = userInput.nextInt();

        int minutes = seconds / 60;
        int reaminingSeconds = seconds % 60;

        System.out.println(seconds + " is equivalent to " + minutes + " minutes and " + reaminingSeconds + " seconds.");
    }
}

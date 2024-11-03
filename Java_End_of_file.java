
/**
 * Java_End_of_file
 */
import java.util.Scanner;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String line = "";
        int n = 1;
        try {
            while (userInput.hasNext()) {
                line = userInput.nextLine();
                System.out.println(n + " " + line);
                n++;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Enter a line to read");
        }
    }
}
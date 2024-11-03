import java.util.Scanner;

public class FahrenheitToCelsious {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");

        double fahrenheit = userInput.nextInt();
        double celsious = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(celsious);

    }
}
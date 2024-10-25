import java.util.Scanner;

public class Chapter2P7ConstantName {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");

        double radius = userInput.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle is " + area);
    }
}

import java.util.Scanner;

public class Chapter2P9P2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte byteValue = userInput.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = userInput.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = userInput.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = userInput.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = userInput.nextFloat();

        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue + " " + floatValue);
    }
}

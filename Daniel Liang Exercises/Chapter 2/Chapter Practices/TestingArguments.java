import java.util.Scanner;

public class TestingArguments {
    public static void main(String[] args) {
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);

        // if (args.length < 3) {
        // System.out.println("Please provide 2 numbers and an operator. Here is an
        // example 1 + 2.");
        // }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            String symbol = args[1];

            System.out.println("Arguments successfully read: " + a + " " + symbol + " " + b);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Error: Please provide 2 numbers and an operator. Here is an example 1 + 2");
        } catch (Exception e) {
            System.err.println("Please make sure first and last are numbers");
        }
    }
}

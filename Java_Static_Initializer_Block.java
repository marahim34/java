import java.util.Scanner;

class Java_Static_Initializer_Block {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int a = userInput.nextInt();
        int b = userInput.nextInt();

        if (a > 0 && b > 0) {
            int area = a * b;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
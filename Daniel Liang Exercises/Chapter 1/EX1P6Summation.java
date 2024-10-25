/*
(Summation of a series) Write a program that displays the result of
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
*/
public class EX1P6Summation {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i < 10; i++) {
            result += i;
        }

        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + result);

    }
}

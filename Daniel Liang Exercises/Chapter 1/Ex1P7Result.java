/*
(Approximatep) p can be computed using the following formula:
p = 4 * ¢1 -
1
3 +
1
5 -
1
7 +
1
9 -
1
11 + c≤
Write a program that displays the result of 4 * ¢1 -
1
3 +
1
5 -
1
7 +
1
9 -
1
11
≤
and 4 * ¢1 -
1
3 +
1
5 -
1
7 +
1
9 -
1
11 +
1
13
≤. Use 1.0 instead of 1 in your
program.
*/

public class Ex1P7Result {
    public static void main(String[] args) {
        System.out.println("4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)) = "
                + 4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)));
        System.out.println("4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13)) = "
                + 4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7)
                        + (1 / 9) - (1 / 11) + (1 / 13)));
    }
}

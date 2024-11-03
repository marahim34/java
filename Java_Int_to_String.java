import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= -100 && n < 101) {
        String s = Integer.toString(n);
        System.out.println("Good job");
    } else {
        System.out.println("Wrong answer");
    }

}

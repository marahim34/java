public class FormatSpecifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'A';
        short s = 127;
        int i = 264654;
        float f = 2.44f;
        double d = 2.457485;

        System.out.printf("The value of boolean B is %b\n", b);
        System.out.printf("The value of boolean c is %c\n", c);
        System.out.printf("The value of short S is %d\n", s);
        System.out.printf("The value of integer i is %d\n", i);
        System.out.printf("The value of float f is %.2f\n", f);
        System.out.printf("The value of double d is %f", d);
    }
}

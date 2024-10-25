/*
2.6 Identify and fix the errors in the following code:
1 public class Test {
2 public static void main(String[] args) {
3 int i = j = k = 2;
4 System.out.println(i + " " + j + " " + k);
5 }
6 }
*/

public class ChapterP2P6 {

    public static void main(String[] args) {
        int i, j, k;

        i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        isMagicNumber(a, b);
    }

    public static void isMagicNumber(int a, int b) {
        if ( a > b ) {
            b += 10;
            a *= 2;
        } else {
            a += 10;
            b *= 2;
        }
        System.out.println (a + " " + b);
    }
}
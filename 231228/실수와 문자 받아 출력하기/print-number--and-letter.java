import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        System.out.println(c);
        System.out.printf("%.2f\n%.2f\n", a, b);
    }
}
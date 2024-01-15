import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int prod = 1;

        while (true) {
            if (n == prod) {
                break;

                prod *= 2;
                x++;
            }
        System.out.println(x);
        }
    }
}
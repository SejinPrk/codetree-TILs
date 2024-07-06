import java.util.Scanner;

public class Main {

    public static int calculate(int n) {
        if (n == 1) return 2;
        if (n == 2) return 4;

        return (calculate(n-2) * calculate(n-1)) % 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = calculate(n);
        System.out.println(result);
    }
}
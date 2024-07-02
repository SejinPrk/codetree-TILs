import java.util.Scanner;

public class Main {
    public static int sumOdds(int n) {
        // n이 홀수일 때
        if (n <= 0) {
            return 0;
        } else if (n % 2 != 0) {
            return n + sumOdds(n - 2);
        } else {
            return sumOdds(n - 1);
        }
    }

    // n이 짝수일 때
    public static int sumEvens(int n) {
        if (n < 2) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sumEvens(n - 2);
        } else {
            return sumEvens(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    if (n % 2 == 0)
        System.out.println(sumEvens(n));
    else
        System.out.println(sumOdds(n));
    }
}
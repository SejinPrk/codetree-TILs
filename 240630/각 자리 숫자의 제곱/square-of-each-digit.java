import java.util.Scanner;

public class Main {
    public static int F(int n) {
        if(n < 10)
            return n * n;

        int digit = n % 10; // 마지막 자리 숫자
        return (digit * digit) + F(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(F(n));
    }
}
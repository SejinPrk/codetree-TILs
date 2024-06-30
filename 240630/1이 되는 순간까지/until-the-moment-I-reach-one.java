import java.util.Scanner;

public class Main {
    public static int F(int n) {
        // Default 케이스: N이 1이면 작업 종료
        if (n == 1) {
            return 0;
        }
        // 짝수인 경우: 2로 나눈다
        else if (n % 2 == 0) {
            return 1 + F(n / 2);
        }
        // 홀수인 경우: 3으로 나눈 몫을 취한다
        else {
            return 1 + F(n / 3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(F(n));
    }
}
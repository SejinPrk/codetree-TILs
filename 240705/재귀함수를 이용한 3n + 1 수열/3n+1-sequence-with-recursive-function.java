import java.util.Scanner;

public class Main {

    // 콜라츠 추측을 재귀적으로 계산하는 함수
    public static int collatzSteps(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
           return 1 + collatzSteps(n / 2);
        } else {
            return 1 + collatzSteps(n * 3 + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int steps = collatzSteps(n);
        System.out.println(steps);
    }
}
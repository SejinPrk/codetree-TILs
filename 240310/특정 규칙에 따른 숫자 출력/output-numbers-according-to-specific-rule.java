import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num = 1;
        // 숫자 출력
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 숫자 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print(num + " ");
                num = (num % 9) + 1; // 숫자가 1에서 9까지 순환하도록 설정
            }
            System.out.println();
        }
    }
}
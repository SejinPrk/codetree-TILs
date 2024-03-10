import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 상단 삼각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 하단 삼각형 출력
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
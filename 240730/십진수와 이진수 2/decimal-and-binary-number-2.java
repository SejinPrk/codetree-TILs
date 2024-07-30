import java.util.Scanner;

public class Main {
    public static final int MAX_DIGIT = 20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryInput = sc.next();

        // 이진수 -> 십진수
        int decimal = 0;
        for (int i = 0; i < (int)binaryInput.length(); i++) {
            decimal = decimal * 2 + (binaryInput.charAt(i) - '0');
        }

        // *17
        decimal *= 17;

        // 다시 이진수로 변환
        int[] digits = new int[MAX_DIGIT];
        int cnt = 0;

        while (true) {
            if (decimal < 2) {
                digits[cnt++] = decimal;
                break;
            }

            digits[cnt++] = decimal % 2;
            decimal /= 2;
        }

        // 이진수 출력
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
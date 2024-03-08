import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int len = A.length();

        // 문자열 B를 순환시켜 A와 일치하는 위치 찾기
        int shift = -1;
        for (int i = 0; i < len; i++) {
            if (A.equals(B.substring(i) + B.substring(0, i))) {
                shift = i;
                break;
            }
        }

        // 결과 출력
        if (shift == -1) {
            System.out.println(-1);
        } else {
            System.out.println(shift);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(WholeNumber(a, b));
    }

    // 온전수를 구하는 함수
    public static int WholeNumber(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
                continue;
            } else {
                cnt++;
            }
        }
        return cnt;
    }

}
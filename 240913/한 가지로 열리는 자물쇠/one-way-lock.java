import java.util.Scanner;

public class Main {
    // 주어진 조합이 자물쇠를 열 수 있는지 확인하는 메소드
    public static boolean isUnlockable(int a, int b, int c, int x, int y, int z) {
        // 각 자리의 차이가 2 이내인지 확인 (한 자리라도 만족하면 true 반환)
        return Math.abs(a - x) <= 2 || Math.abs(b - y) <= 2 || Math.abs(c - z) <= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        // 가능한 모든 조합 (x, y, z)에 대해 반복
        for (int x = 1; x <= N; x++) {
            for (int y = 1; y <= N; y++) {
                for (int z = 1; z <= N; z++) {
                    // 해당 조합이 자물쇠를 열 수 있는지 확인
                    if (isUnlockable(a, b, c, x, y, z)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
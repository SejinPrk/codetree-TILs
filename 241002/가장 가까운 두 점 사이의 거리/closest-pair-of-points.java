import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        // 가장 가까운 두 점 사이의 거리의 제곱 초기값을 최대값으로 설정
        int minDistSquared = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int disSquared = dx * dx + dy * dy;

                if (disSquared < minDistSquared) {
                    minDistSquared = disSquared;
                }
            }
        }
        System.out.println(minDistSquared);
        sc.close();
    }
}
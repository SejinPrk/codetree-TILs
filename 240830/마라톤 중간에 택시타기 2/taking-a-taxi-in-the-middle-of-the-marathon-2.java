import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] checkpoints = new int[n][2];

        for (int i = 0; i < n; i++) {
            checkpoints[i][0] = sc.nextInt(); // x 좌표
            checkpoints[i][1] = sc.nextInt(); // y 좌표
        }

        // 전체 경로의 총 거리 계산
        int totalDistance = 0;
        for (int i = 0; i < n - 1; i++) {
            totalDistance += manhattanDistance(checkpoints[i], checkpoints[i + 1]);
        }

        // 한 체크포인트를 건너뛰었을 때의 최소 거리 계산
        int minDistance = totalDistance;

        for (int i = 1; i < n - 1; i++) { // 1번과 n번 체크포인트는 제외
            // i번째 체크포인트를 건너뛰는 경우 거리 계산
            int skipDistance = totalDistance
                            - manhattanDistance(checkpoints[i - 1], checkpoints[i])
                            - manhattanDistance(checkpoints[i], checkpoints[i + 1])
                            + manhattanDistance(checkpoints[i - 1], checkpoints[i + 1]);
            // 최소 거리 업데이트
            minDistance = Math.min(minDistance, skipDistance);
        }
        System.out.println(minDistance);
    }
    public static int manhattanDistance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }
}
import java.util.Scanner;

public class Main {
    // 격자의 크기 N
    static int N;
    // 맵 정보
    static char[][] map;
    // 방향: 상, 우, 하, 좌
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new char[N][N];

        // 격자의 거울 정보 입력
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        // 레이저 시작 위치 K 입력
        int K = sc.nextInt();

        // 레이저 시작 위치와 방향 설정
        int x = 0, y = 0, dir = 0;

        // K에 따라 레이저 시작 지점 설정
        if (K <= N) {
            x = 0;
            y = K - 1;
            dir = 2; // 아래로
        } else if (K <= 2 * N) {
            x = K - N - 1;
            y = N - 1;
            dir = 3; // 왼쪽으로
        } else if (K <= 3 * N) {
            x = N - 1;
            y = 3 * N - K;
            dir = 0; // 위로
        } else {
            x = 4 * N - K;
            y = 0;
            dir = 1; // 오른쪽으로
        }

        // 레이저 경로 추적 및 거울 튕김 횟수 계산
        int reflections = 0;
        while (x >= 0 && x < N && y >= 0 && y < N) {
            reflections++;

            // 현재 위치의 거울 정보
            char mirror = map[x][y];

            // 거울에 따라 방향을 바꿈
            if (mirror == '/') {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else if (dir == 3) dir = 2;
            } else if (mirror == '\\') {
                if (dir == 0) dir = 3;
                else if (dir == 1) dir = 2;
                else if (dir == 2) dir = 1;
                else if (dir == 3) dir = 0;
            }

            // 다음 위치로 이동
            x += dx[dir];
            y += dy[dir];
        }

        // 결과 출력
        System.out.println(reflections);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        // 방향을 위한 변수(아래->오른쪽->위->왼쪽)
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int x = 0, y = 0, dir = 0; // 시작점(0, 0)
        for (int i = 1; i <= n * m; i++) {
            arr[x][y] = i; // 현재 위치에 숫자 채우기

            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 배열 범위를 벗어나거나 이미 숫자가 채워진 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                dir = (dir+1) % 4; // 방향 전환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
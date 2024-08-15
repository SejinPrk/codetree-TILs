import java.util.Scanner;

public class Main {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int n;
    private static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n]; // n x n 크기의 2차원 배열 생성

        // 격자 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int cnt = countCells();
        System.out.println(cnt);

        sc.close();    
    }

    private static boolean inRange(int x, int y) { // 주어진 좌표가 격자 내에 있는지 확인
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    private static int countNearOnes(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (inRange(nx, ny) && grid[nx][ny] == 1) { // 주어진 셀의 상하좌우로 인접한 칸 중 1이 적힌 칸의 수가 3개 이상인 곳의 개수를 세어 반환
                cnt++;
            }
        }
        return cnt;
    }
    
    private static int countCells() {
        int cnt = 0; 
        for (int i = 0; i < n; i++) { // 모든 셀을 순회하면서 countNearOnes가 3 이상인 셀의 개수를 세어 반환
            for (int j = 0; j < n; j++) {
                if (countNearOnes(i, j) >= 3) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
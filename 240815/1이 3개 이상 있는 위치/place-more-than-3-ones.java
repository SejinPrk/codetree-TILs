import java.util.Scanner;

public class Main {
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    private static int n;
    private static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

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

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    private static int countNearOnes(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (inRange(nx, ny) && grid[nx][ny] == 1) {
                cnt++;
            }
        }
        return cnt;
    }
    
    private static int countCells() {
        int cnt = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (countNearOnes(i, j) >= 3) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
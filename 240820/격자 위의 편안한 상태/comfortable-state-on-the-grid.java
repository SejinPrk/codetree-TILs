import java.util.Scanner;

public class Main {
    private static int n;
    private static boolean[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        grid = new boolean[n][n];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            grid[r][c] = true;
            System.out.println(isComfortable(r, c) ? 1 : 0);
        }

        sc.close();
    }

    // 편안한 상태인지 확인
    private static boolean isComfortable(int r, int c) {
        int cnt = 0;
    
        if (r > 0 && grid[r-1][c]) cnt++;
        if (r < n-1 && grid[r+1][c]) cnt++;
        if (c > 0 && grid[r][c-1]) cnt++;
        if (c < n-1 && grid[r][c+1]) cnt++;

        return cnt == 3; // 편안한 상태 반환
    }
}
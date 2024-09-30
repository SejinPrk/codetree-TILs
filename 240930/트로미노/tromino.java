import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // L 모양 블록 (4가지 회전)
                if (i + 1 < n && j + 1 < m) maxSum = Math.max(maxSum, grid[i][j] + grid[i+1][j] + grid[i+1][j+1]);
                if (i + 1 < n && j + 1 < m) maxSum = Math.max(maxSum, grid[i][j] + grid[i][j+1] + grid[i+1][j]);
                if (i + 1 < n && j > 0) maxSum = Math.max(maxSum, grid[i][j] + grid[i+1][j] + grid[i+1][j-1]);
                if (i > 0 && j + 1 < m) maxSum = Math.max(maxSum, grid[i][j] + grid[i][j+1] + grid[i-1][j+1]);

                // 일자형 블록 (수평, 수직)
                if (j + 2 < m) maxSum = Math.max(maxSum, grid[i][j] + grid[i][j+1] + grid[i][j+2]);
                if (i + 2 < n) maxSum = Math.max(maxSum, grid[i][j] + grid[i+1][j] + grid[i+2][j]);
            }
        }
        System.out.println(maxSum);
        sc.close();
    }
}
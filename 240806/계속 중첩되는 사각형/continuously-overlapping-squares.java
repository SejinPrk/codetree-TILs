import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] rectangles = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                rectangles[i][j] = scanner.nextInt();
            }
        }

        int result = calculateBlueArea(n, rectangles);
        System.out.println(result);

        scanner.close();
    }

    public static int calculateBlueArea(int n, int[][] rectangles) {
        int[][] grid = new int[201][201];

        for (int i = 0; i < n; i++) {
            int color = i % 2 + 1; // 1: 빨간색, 2: 파란색
            int x1 = rectangles[i][0] + 100;
            int y1 = rectangles[i][1] + 100;
            int x2 = rectangles[i][2] + 100;
            int y2 = rectangles[i][3] + 100;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = color;
                }
            }
        }

        int blueArea = 0;
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 2) {
                    blueArea++;
                }
            }
        }

        return blueArea;
    }
}
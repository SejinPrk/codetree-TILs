import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n개의 직사각형 좌표를 입력받아 2차원 배열 rectangles에 저장
        int n = sc.nextInt();
        int[][] rect = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                rect[i][j] = sc.nextInt();
            }
        }

        int result = calculatedBlueArea(n, rect);
        System.out.println(result);

        sc.close();
    }

    // 파란색 영역의 넓이를 계산
    public static int calculatedBlueArea(int n, int[][] rect) {
        int[][] grid = new int[201][201];

        for (int i = 0; i < n; i++) {
            int color = i % 2 + 1; // 1: red, 2: blue
            int x1 = rect[i][0] + 100;
            int y2 = rect[i][1] + 100;
            int x2 = rect[i][2] + 100;
            int y2 = rect[i][3] + 100;

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
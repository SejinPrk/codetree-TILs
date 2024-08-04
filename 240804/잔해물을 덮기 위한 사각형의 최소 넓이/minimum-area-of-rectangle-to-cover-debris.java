import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000;
    private static final int SIZE = 2001; // -1000 ~ 1000 + OFFSET

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[SIZE][SIZE];

        // 첫 번째 직사각형 그리기
        int x1 = sc.nextInt() + OFFSET;
        int y1 = sc.nextInt() + OFFSET;
        int x2 = sc.nextInt() + OFFSET;
        int y2 = sc.nextInt() + OFFSET;
        drawRectangle(grid, x1, y1, x2, y2, 1); // 구분을 위한 value: 1

        // 두 번째 직사각형 그리기
        x1 = sc.nextInt() + OFFSET;
        y1 = sc.nextInt() + OFFSET;
        x2 = sc.nextInt() + OFFSET;
        y2 = sc.nextInt() + OFFSET;
        drawRectangle(grid, x1, y1, x2, y2, 0);// 구분을 위한 value: 0

        // 잔해물을 덮는 최소 직사각형 찾기
        int minX = SIZE, minY= SIZE, maxX = 0, maxY = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 1) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }

        // 최소 직사각형의 넓이
        int area = (maxX - minX) * (maxY - minY);
        System.out.println(area);
        
        sc.close();
    }

    private static void drawRectangle(int[][] grid, int x1, int y1, int x2, int y2, int value) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                grid[i][j] = value;
            }
        }
    }
}
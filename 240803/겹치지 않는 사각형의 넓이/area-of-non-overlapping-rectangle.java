import java.util.Scanner;

public class Main {
    private static final int OFFSET = 1000;
    private static final int SIZE = 2001; // -1000 ~ 1000, plus OFFSET

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[SIZE][SIZE];

        // 직사각형 A 입력 및 그리기
        int ax1 = scanner.nextInt() + OFFSET;
        int ay1 = scanner.nextInt() + OFFSET;
        int ax2 = scanner.nextInt() + OFFSET;
        int ay2 = scanner.nextInt() + OFFSET;
        drawRectangle(grid, ax1, ay1, ax2, ay2, 1);

        // 직사각형 B 입력 및 그리기
        int bx1 = scanner.nextInt() + OFFSET;
        int by1 = scanner.nextInt() + OFFSET;
        int bx2 = scanner.nextInt() + OFFSET;
        int by2 = scanner.nextInt() + OFFSET;
        drawRectangle(grid, bx1, by1, bx2, by2, 1);

        // 직사각형 M 입력 및 그리기 (덮어쓰기)
        int mx1 = scanner.nextInt() + OFFSET;
        int my1 = scanner.nextInt() + OFFSET;
        int mx2 = scanner.nextInt() + OFFSET;
        int my2 = scanner.nextInt() + OFFSET;
        drawRectangle(grid, mx1, my1, mx2, my2, 0);

        // 남은 넓이 계산
        int remainingArea = countRemainingArea(grid);

        System.out.println(remainingArea);
        scanner.close();
    }

    private static void drawRectangle(int[][] grid, int x1, int y1, int x2, int y2, int value) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                grid[i][j] = value;
            }
        }
    }

    private static int countRemainingArea(int[][] grid) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
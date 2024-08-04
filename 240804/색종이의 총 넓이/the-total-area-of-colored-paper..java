import java.util.Scanner;

public class Main {
    private static final int OFFSET = 100;
    private static final int SIZE = 201; // -100 ~ 100 + OFFSET
    private static final int PAPER_SIZE = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] grid = new boolean[SIZE][SIZE];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;
            fillPaper(grid, x, y); //  각 색종이의 영역을 true로 채운다.
        }

        int totalArea = countArea(grid); //  grid에서 true로 표시된 칸의 개수를 세어 총 넓이를 계산
        System.out.println(totalArea);

        sc.close();
    }

    private static void fillPaper(boolean[][] grid, int x, int y) {
        for (int i = x; i < x + PAPER_SIZE; i++) {
            for (int j = y; j < y + PAPER_SIZE; j++) {
                grid[i][j] = true;
            }
        }
    }

    private static int countArea(boolean[][] grid) {
        int cnt = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
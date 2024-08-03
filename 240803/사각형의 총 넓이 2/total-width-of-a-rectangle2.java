import java.util.Scanner;

public class Main {
    private static final int OFFSET = 100;
    private static final int SIZE = 201; // -100 ~ 100, + OFFSET

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        boolean[][] grid = new boolean[SIZE][SIZE];

        for (int i = 0; i < N; i++) {
            int x1 = scanner.nextInt() + OFFSET;
            int y1 = scanner.nextInt() + OFFSET;
            int x2 = scanner.nextInt() + OFFSET;
            int y2 = scanner.nextInt() + OFFSET;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    grid[x][y] = true;
                }
            }
        }

        int totalArea = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j]) {
                    totalArea++;
                }
            }
        }

        System.out.println(totalArea);
        scanner.close();
    }
}
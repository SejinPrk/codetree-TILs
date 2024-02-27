import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
           grid[i][0] = 1;
           grid[0][i] = 1;
        }

        for(int i = 1; i < n; i++){
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j-1] + grid[i-1][j-1];

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
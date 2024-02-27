import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        int [][] grid = new int[n][n];
        
        for (int i = n - 1; i >= 0; i--) {
            if ((n - i) % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    grid[j][i] = num++;
                }
            } else { // 홀수 번째 행은 아래에서 위로
                for (int j = n - 1; j >= 0; j--) {
                    grid[j][i] = num++;
                }
            }
        }

        // 격자 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
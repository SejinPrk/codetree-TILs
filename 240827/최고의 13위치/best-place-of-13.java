import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n+1][n+1];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;

        // 각 행에서 1 * 3 크기의 격자를 선택
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                // 연속된 3칸의 동전 개수 합산
                int coinSum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                // 최대값 갱신
                if (coinSum > maxCoins) {
                    maxCoins = coinSum;
                } 
            }
        }
        System.out.println(maxCoins);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n+10][n+10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxCoins = 0;

        // 첫 번째 격자 위치 선택
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 <= n; j1++) {
                int coins1 = grid[i1][j1] + grid[i1][j1 + 1] + grid[i1][j1 + 2];

                // 두 번째 격자 위치 선택
                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 <= n - 3; j2++) {
                        // 겹치는지 확인
                        if (i1 == i2 && !(j1 + 2 < j2 || j2 + 2 < j1)) {
                            continue;
                        }
                        int coins2 = grid[i2][j2] + grid[i2][j2 + 1] + grid[i2][j2 + 2];

                        // 최대 동전 개수 갱신
                        maxCoins = Math.max(maxCoins, coins1 + coins2);
                    }
                } 
            }
        }
        System.out.println(maxCoins);        
    }
}
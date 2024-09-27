import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 격자 크기 N 입력
        int N = scanner.nextInt();
        int[][] grid = new int[N][N];

        // 격자 정보 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 최대 동전 수를 저장할 변수
        int maxCoins = 0;

        // 3x3 격자가 N x N 격자를 벗어나지 않도록 검사
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= N - 3; j++) {
                int currentCoins = 0;
                
                // 3x3 격자 내의 동전 수 세기
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        currentCoins += grid[i + x][j + y];
                    }
                }
                
                // 최대 동전 수 갱신
                maxCoins = Math.max(maxCoins, currentCoins);
            }
        }

        // 결과 출력
        System.out.println(maxCoins);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // 방향: 오른쪽(0), 위(1), 왼쪽(2), 아래(3)
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        int x = n / 2; // 가운데 x 좌표
        int y = n / 2; // 가운데 y 좌표
        int num = 1;   // 시작 숫자
        matrix[x][y] = num++; // 가운데에 1 배치
        
        int steps = 1; // 처음에는 1칸 이동
        while (num <= n * n) {
            // 방향 전환하며 이동
            for (int i = 0; i < 4; i++) {
                for (int step = 0; step < steps; step++) {
                    x += dx[i];
                    y += dy[i];
                    
                    if (x >= 0 && x < n && y >= 0 && y < n && matrix[x][y] == 0) {
                        matrix[x][y] = num++;
                    } else {
                        break;
                    }
                    
                    if (num > n * n) break;
                }
                if (i % 2 == 1) steps++; // 위쪽 또는 아래쪽으로 이동한 후에는 이동 칸수를 1 증가
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
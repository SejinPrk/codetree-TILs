import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 격자의 크기 n과 점의 개수 m 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 격자 배열 초기화
        int[][] grid = new int[n][n];

        // 각 점의 행 번호와 열 번호를 입력받아 해당 위치의 값을 설정
        for (int i = 0; i < m; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int value = row * col;
            grid[row - 1][col - 1] = value; // 행과 열 번호는 1부터 시작하므로 인덱스에 맞게 조정
        }

        // 격자 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
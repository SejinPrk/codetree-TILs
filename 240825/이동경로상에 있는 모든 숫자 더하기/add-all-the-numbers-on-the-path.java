import java.util.Scanner;

public class Main {
    // 북 -> 동 -> 남 -> 서
    static int[] dx = {-1, 0, 1, 0}; // 행 이동
    static int[] dy = {0, 1, 0, -1}; // 열 이동

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 격자 크기
        int t = sc.nextInt(); // 명령 개수
        sc.nextLine();
        String commands = sc.nextLine(); // 명령어

        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int x = n / 2;
        int y = n / 2;
        int dir = 0; // 0: 북, 1: 동, 2: 남, 3: 서

        // 초기 위치 값 더하기
        int sum = grid[x][y];

        for (int i = 0; i < t; i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                dir = (dir + 3) % 4;
            } else if (command == 'R') {
                dir = (dir + 1) % 4;
            } else if (command == 'F') {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    x = nx;
                    y = ny;
                    sum += grid[x][y];
                }
            }
        }
        System.out.println(sum);
    }
}
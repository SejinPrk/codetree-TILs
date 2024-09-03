import java.util.Scanner;

public class Main {
    // 바둑판 크기
    static final int SIZE = 19;
    // 4가지 방향 (오른쪽, 아래쪽, 오른쪽 아래 대각선, 왼쪽 아래 대각선)
    static int[] dx = {0, 1, 1, -1};
    static int[] dy = {1, 0, 1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[SIZE][SIZE];

        // 바둑판 상태 입력
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // 승리 여부 판정
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != 0) {
                    int winner = board[i][j];
                    // 4가지 방향으로 체크
                    for (int dir = 0; dir < 4; dir++) {
                        if (check(board, i, j, winner, dir)) {
                            // 이긴 경우 출력
                            System.out.println(winner);
                            // 세 번째 바둑알의 위치 출력
                            int nx = i + dx[dir] * 2;
                            int ny = j + dy[dir] * 2;
                            // 좌표는 1부터 시작하므로 1씩 더함
                            System.out.println((nx + 1) + " " + (ny + 1));
                            return;
                        }
                    }
                }
            }
        }

        // 승부가 결정되지 않은 경우
        System.out.println(0);
    }

    // 주어진 방향으로 5개의 바둑알이 연속인지 확인하는 함수
    private static boolean check(int[][] board, int x, int y, int color, int dir) {
        int count = 1; // 현재 위치 포함해서 1개

        for (int step = 1; step < 5; step++) {
            int nx = x + dx[dir] * step;
            int ny = y + dy[dir] * step;

            // 범위를 벗어나거나 다른 색이 나오면 중단
            if (nx < 0 || nx >= SIZE || ny < 0 || ny >= SIZE || board[nx][ny] != color) {
                return false;
            }
            count++;
        }

        // 5개 연속을 찾은 경우, 그 앞이나 뒤에 같은 색이 있으면 안 됨
        int prevX = x - dx[dir];
        int prevY = y - dy[dir];
        int nextX = x + dx[dir] * 5;
        int nextY = y + dy[dir] * 5;

        // 연속된 5개의 앞과 뒤를 체크
        if ((prevX >= 0 && prevX < SIZE && prevY >= 0 && prevY < SIZE && board[prevX][prevY] == color) ||
            (nextX >= 0 && nextX < SIZE && nextY >= 0 && nextY < SIZE && board[nextX][nextY] == color)) {
            return false;
        }

        return true;
    }
}
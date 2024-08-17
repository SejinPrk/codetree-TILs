import java.util.Scanner;

public class Main {
    public static int n;
    public static int[][] answer = new int[4][4];

    public static int[] dx = {0, 1,  0, -1};
    public static int[] dy = {1, 0, -1,  0};
    public static int x = 0, y = 0;      // 시작: (0, 0)
    public static int dirNum = 0;        // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽

    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 처음 시작 위치에 초기값 1 넣기
        answer[x][y] = 1;
        
        // n*n번 진행
        for(int i = 2; i <= n * n; i++) {
            // 현재 방향 dir를 기준으로 그 다음 위치 값을 계산
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            // 더 이상 나아갈 수 없다면 시계방향으로 90도 회전
            if(!inRange(nx, ny) || answer[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;

            // 그 다음 위치로 이동한 다음 배열에 올바른 값을 채워넣기
            x = x + dx[dirNum]; y = y + dy[dirNum];
            answer[x][y] = i;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }
    }
}
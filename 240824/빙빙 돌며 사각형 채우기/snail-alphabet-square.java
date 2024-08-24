import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열
        char[][] arr = new char[n][m];

        // 이동 방향: 오른쪽, 아래, 왼쪽, 위 
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0; // 시작 좌표(x, y), 방향(오른쪽)
        char currentChar = 'A'; // 시작 문자

        for (int i = 0; i < n * m; i++) {
            arr[x][y] = currentChar; // 현 위치에 문자 넣기
            currentChar = (currentChar == 'Z') ? 'A' : (char) (currentChar + 1); // Z 다음에 A로 다시 돌아감

            // 다음 좌표
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 좌표가 범위를 벗어나거나 이미 문자가 채워져 있으면 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 전환: 오른쪽 -> 아래 -> 왼쪽 -> 위
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            // 다음 좌표로 이동
            x = nx;
            y = ny;
        }   
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
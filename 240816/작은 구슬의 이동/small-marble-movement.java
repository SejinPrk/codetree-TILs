import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // 격자의 크기 n
        int t = sc.nextInt();  // 시간 t
        int r = sc.nextInt();  // 초기 위치의 행 r
        int c = sc.nextInt();  // 초기 위치의 열 c
        char d = sc.next().charAt(0);  // 초기 방향 d

        // 방향에 따른 행과 열의 변화량
        int[] dr = {0, 0, 1, -1};  // R, L, D, U 순서
        int[] dc = {1, -1, 0, 0};  // R, L, D, U 순서
        int direction = 0;

        // 방향 문자에 따라 방향 인덱스 결정
        switch (d) {
            case 'R': direction = 0; break;
            case 'L': direction = 1; break;
            case 'D': direction = 2; break;
            case 'U': direction = 3; break;
        }

        // t초 동안 구슬의 이동을 시뮬레이션
        for (int i = 0; i < t; i++) {
            int nr = r + dr[direction];  // 새로운 위치의 행
            int nc = c + dc[direction];  // 새로운 위치의 열

            // 벽에 부딪히는 경우 방향 반전
            if (nr < 1 || nr > n) {
                direction = 3 - direction;  // U <-> D 반전
            } else {
                r = nr;
            }

            if (nc < 1 || nc > n) {
                direction = 1 - direction;  // R <-> L 반전
            } else {
                c = nc;
            }
        }

        // 최종 위치 출력
        System.out.println(r + " " + c);
    }
}
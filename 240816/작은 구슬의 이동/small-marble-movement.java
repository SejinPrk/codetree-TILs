import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 격자의 크기 n
        int t = sc.nextInt();  // 시간 t
        int r = sc.nextInt();  // 초기 위치의 행 r
        int c = sc.nextInt();  // 초기 위치의 열 c
        char d = sc.next().charAt(0);  // 초기 방향 d

        // 방향에 따른 변화량 (행, 열)
        int dr = 0, dc = 0;

        switch (d) {
            case 'R': dc = 1; break;
            case 'L': dc = -1; break;
            case 'D': dr = 1; break;
            case 'U': dr = -1; break;
        }

        // t초 동안 시뮬레이션
        for (int i = 0; i < t; i++) {
            r += dr;
            c += dc;

            // 벽에 부딪히면 방향 반전
            if (r < 1 || r > n) {
                dr *= -1;
                r += dr;  // 반전된 방향으로 한 칸 이동
            }
            if (c < 1 || c > n) {
                dc *= -1;
                c += dc;  // 반전된 방향으로 한 칸 이동
            }
        }

        // 최종 위치 출력
        System.out.println(r + " " + c);
    }
}
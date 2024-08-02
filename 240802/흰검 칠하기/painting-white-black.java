import java.util.Scanner;

public class Main {
    public static final int MAX_K = 100000;
    
    // 변수 선언
    public static int n;
    public static int[] a = new int[2 * MAX_K + 1];
    public static int[] cntB = new int[2 * MAX_K + 1];
    public static int[] cntW = new int[2 * MAX_K + 1];
    public static int b, w, g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 명령의 수 입력
        n = sc.nextInt();

        // 시작 위치 설정 (중앙)
        int cur = MAX_K;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            if (c == 'L') {
                // x칸 왼쪽으로 칠하기
                while (x-- > 0) {
                    a[cur] = 1; // 흰색
                    cntW[cur]++;
                    if (x > 0) cur--;
                }
            } else {
                // x칸 오른쪽으로 칠하기
                while (x-- > 0) {
                    a[cur] = 2; // 검은색
                    cntB[cur]++;
                    if (x > 0) cur++;
                }
            }
        }

        // 타일의 색상 결정
        for (int i = 0; i <= 2 * MAX_K; i++) {
            // 검은색과 흰색으로 두 번 이상 칠해진 타일은 회색
            if (cntB[i] >= 2 && cntW[i] >= 2) g++;
            // 현재 색 == 타일의 색
            else if (a[i] == 1) w++;
            else if (a[i] == 2) b++;
        }

        System.out.print(w + " " + b + " " + g);
    }
}
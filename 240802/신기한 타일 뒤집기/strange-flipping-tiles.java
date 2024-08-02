import java.util.Scanner;

public class Main {
    public static final int MAX_K = 100000;
    // 변수 선언
    public static int n;
    public static int[] tiles = new int[2 * MAX_K + 1]; // 0: 회색, 1: 흰색, 2: 검은색
    public static int white, black;

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
                // x칸 왼쪽으로 뒤집기
                while (x-- > 0) {
                    tiles[cur] = 1; // 흰색
                    if (x > 0) cur--;
                }
            } else {
                // x칸 오른쪽으로 뒤집기
                while (x-- > 0) {
                    tiles[cur] = 2; // 검은색
                    if (x > 0) cur++;
                }
            }
        }
        
        // 타일의 색상 계산
        for (int i = 0; i <= 2 * MAX_K; i++) {
            if (tiles[i] == 1) white++;
            else if (tiles[i] == 2) black++;
        }
        
        System.out.print(white + " " + black);
    }
}
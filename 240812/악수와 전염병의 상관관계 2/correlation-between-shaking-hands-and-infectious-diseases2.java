import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자 수
        int K = sc.nextInt(); // 전염 가능 횟수
        int P = sc.nextInt(); // 처음 감염된 개발자 번호
        int T = sc.nextInt(); // 악수 횟수

        boolean[] infected = new boolean[N + 1]; // 감염 여부
        int[] infectionsLeft = new int[N + 1]; // 남은 전염 가능 횟수
        
        infected[P] = true;
        infectionsLeft[P] = K;

        // 악수 정보 저장
        int[][] handshakes = new int[T][3];
        for (int i = 0; i < T; i++) {
            handshakes[i][0] = sc.nextInt(); // 시간
            handshakes[i][1] = sc.nextInt(); // x 개발자
            handshakes[i][2] = sc.nextInt(); // y 개발자
        }

        // 시간 순 정렬
        Arrays.sort(handshakes, (a, b) -> Integer.compare(a[0], b[0]));

        // 각 악수 처리
        for (int[] hs : handshakes) {
            int x = hs[1], y = hs[2];
            if (infected[x] && infectionsLeft[x] > 0) {
                infected[y] = true;
                if (infectionsLeft[y] == 0) infectionsLeft[y] = K;
                infectionsLeft[x]--;
            }
            if (infected[y] && infectionsLeft[y] > 0) {
                infected[x] = true;
                if (infectionsLeft[x] == 0) infectionsLeft[x] = K;
                infectionsLeft[y]--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(infected[i] ? "1" : "0");
        }
    }
}
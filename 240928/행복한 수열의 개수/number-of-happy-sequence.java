import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 격자 크기 
        int M = sc.nextInt(); // 연속된 숫자 수
        sc.nextLine();

        int[][] grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int happySeqCnt = 0;

        // 각 행 검사
        for (int i = 0; i < N; i++) {
            if (isHappySeq(grid[i], M)) {
                happySeqCnt++;
            }
        }

        // 각 열 검사
        for (int j = 0; j < N; j++) {
            int[] column = new int[N];
            for (int i = 0; i < N; i++) {
                column[i] = grid[i][j];
            }
            if (isHappySeq(column, M)) {
                happySeqCnt++;
            }
        }
        System.out.println(happySeqCnt);
    }

    private static boolean isHappySeq(int[] seq, int m) {
        if (m == 1) {
            // m이 1일 경우, 모든 수열은 행복한 수열
            return true;
        }
        int cnt = 1;

        for (int i = 1; i < seq.length; i++) {
            if (seq[i] == seq[i-1]) {
                cnt++;
                // 연속된 숫자가 m개 이상일 때 행복한 수열
                if (cnt >= m) {
                    return true;
                }
            } else {
                cnt = 1;
            }
        }
        return false;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // A, B의 움직임 정보 저장
        int[][] movesA = new int[n][2];
        int[][] movesB = new int[m][2];

        // A의 움직임 입력
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            String d = sc.next();
            movesA[i] = new int[]{t, d.equals("L") ? -1 : 1};
        }

        // B의 움직임 입력
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            String d = sc.next();
            movesB[i] = new int[]{t, d.equals("L") ? -1 : 1};
        }

        int meetCnt = countMeetnigs(movesA, movesB);
        System.out.println(meetCnt);
    }
        
    private static int countMeetnigs(int[][] movesA, int[][] movesB) {
        int posA = 0, posB = 0;
        int timeA = 0, timeB = 0;
        int indexA = 0, indexB = 0;
        int meetCnt = 0;
        boolean lastPositionSame = true;

        while (indexA < movesA.length || indexB < movesB.length) {
            // A 이동
            if (indexA < movesA.length && timeA == 0) {
                int[] move = movesA[indexA];
                timeA = move[0];
                posA += move[1];
                indexA++;
            }

            // B 이동
            if (indexB < movesB.length && timeB == 0) {
                int[] move = movesB[indexB];
                timeB = move[0];
                posB += move[1];
                indexB++;
            }

            // 만남 확인
            if (posA == posB && !lastPositionSame) {
                meetCnt++;
            }

            lastPositionSame = (posA == posB);

            // 시간 감소
            if (timeA > 0) timeA--;
            if (timeB > 0) timeB--;
        }

        return meetCnt;
    }
}
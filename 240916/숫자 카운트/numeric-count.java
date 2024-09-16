import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] queries = new int[N][3];
        for (int i = 0; i < N; i++) {
            queries[i][0] = sc.nextInt(); // 세 자리 수
            queries[i][1] = sc.nextInt(); // 1번 카운트
            queries[i][2] = sc.nextInt(); // 2번 카운트
        }

        int possibleCnt = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i != j && i != k && j != k) {
                        int num = i * 100 + j * 10 + k;
                        if (checkAllQueries(num, queries)) {
                            possibleCnt++;
                        }
                    }
                }
            }
        }

        System.out.println(possibleCnt);
    }

    private static boolean checkAllQueries(int num, int[][] queries) {
        for (int[] query : queries) {
            int[] counts = getCounts(num, query[0]);
            if (counts[0] != query[1] || counts[1] != query[2]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getCounts(int num, int guess) {
        int[] counts = new int[2];
        String numStr = String.format("%03d", num);  
        String guessStr = String.format("%03d", guess);
        
        for (int i = 0; i < 3; i++) {
            if (numStr.charAt(i) == guessStr.charAt(i)) {
                counts[0]++;
            } else if (numStr.indexOf(guessStr.charAt(i)) != -1) {
                counts[1]++;
            }
        }
        
        return counts;
    }
}
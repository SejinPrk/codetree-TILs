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
        for (int i = 102; i <= 987; i++) {
            if (isValidNumber(i) && checkAllQueries(i, queries)) {
                possibleCnt++;
            }
        }

        System.out.println(possibleCnt);
    }

    private static boolean isValidNumber(int num) {
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        return hundreds != tens && hundreds != units && tens != units && hundreds != 0;
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
        String numStr = String.valueOf(num);
        String guessStr = String.valueOf(guess);
        
        for (int i = 0; i < 3; i++) {
            if (numStr.charAt(i) == guessStr.charAt(i)) {
                counts[0]++;
            } else if (numStr.contains(String.valueOf(guessStr.charAt(i)))) {
                counts[1]++;
            }
        }
        
        return counts;
    }
}
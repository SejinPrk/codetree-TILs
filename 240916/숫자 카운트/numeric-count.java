import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] queries = new int[N][5];

        for (int i = 0; i < N; i++) {
            queries[i][0] = sc.nextInt(); // 세 자리 수
            queries[i][1] = sc.nextInt(); // 1번 카운트
            queries[i][2] = sc.nextInt(); // 2번 카운트
        }

        int possibleCnt = 0;

        for (int i = 123; i <= 987; i++) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            if (hundreds == tens || hundreds == units || tens == units) {
                continue;
            }

            boolean isValid = true;

            for (int j = 0; j < N; j++) {
                int targetNo = queries[j][0];
                int expectedCnt1 = queries[j][1];
                int expectedCnt2 = queries[j][2];

                int targetHundreds = targetNo / 100;
                int targetTens = (targetNo / 10) % 10;
                int targetUnits = targetNo % 10;

                int cnt1 = 0; // 동일한 위치에 있는 숫자
                int cnt2 = 0; // 다른 위치에 있는 숫자

                if (hundreds == targetHundreds) cnt1++;
                if (tens == targetTens) cnt1++;
                if (units == targetUnits) cnt1++;          

                if (hundreds == targetTens || hundreds == targetUnits) cnt2++;
                if (tens == targetHundreds || tens == targetUnits) cnt2++;
                if (units == targetHundreds || units == targetTens) cnt2++;

                if (cnt1 != expectedCnt1 || cnt2 != expectedCnt2) {
                    isValid = false;
                    break;
                }
            } 
            if(isValid) {
                possibleCnt++;
            }  
        }
        System.out.println(possibleCnt);
    }
}
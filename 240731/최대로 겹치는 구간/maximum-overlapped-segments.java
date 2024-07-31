import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        final int OFFSET = 100; // -100에서 100까지 설정: 모든 좌표를 양수로 변환
        int[] line = new int[201]; // 0에서 200까지

        // n개의 선분 처리
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;

            line[x1]++; // 시작점에서 +1
            line[x2]--; // 끝점 다음에서 -1
        }

        int maxOverlap = 0; // 최대 겹치는 횟수
        int currOverlap = 0; 
        for (int i = 0; i <= 200; i++) {
            currOverlap += line[i];
            maxOverlap = Math.max(maxOverlap, currOverlap);
        }

        System.out.println(maxOverlap);
        sc.close();
    }
}
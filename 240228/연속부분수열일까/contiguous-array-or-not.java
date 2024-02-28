import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n1 = scanner.nextInt(); // 수열 A의 원소 개수
        int n2 = scanner.nextInt(); // 수열 B의 원소 개수
        int[] sequenceA = new int[n1];
        int[] sequenceB = new int[n2];

        for (int i = 0; i < n1; i++) {
            sequenceA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            sequenceB[i] = scanner.nextInt();
        }

        scanner.close();

        // 수열 B가 수열 A의 연속 부분 수열인지 확인
        boolean isSubsequence = checkSubsequence(sequenceA, sequenceB);
        
        // 결과 출력
        if (!isSubsequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // 수열 B가 수열 A의 연속 부분 수열인지를 확인하는 함수
    public static boolean checkSubsequence(int[] sequenceA, int[] sequenceB) {
        int n1 = sequenceA.length;
        int n2 = sequenceB.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (sequenceA[i] == sequenceB[j]) {
                j++; // 수열 B의 다음 원소 확인
            }
            i++; // 수열 A의 다음 원소 확인
        }

        // 수열 B의 모든 원소를 찾았으면 연속 부분 수열
        return j == n2;
    }
}
import java.util.Scanner;

public class Main {

    // 수열 B가 수열 A의 연속부분수열인지를 판단하는 함수
    public static boolean isSubArray(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;

        // B의 길이가 A보다 길면 B는 A의 연속부분수열이 될 수 없음
        if (n2 > n1) {
            return false;
        }

        // A의 모든 연속부분수열 확인
        for (int i = 0; i <= n1 - n2; i++) {
            boolean isSubArray = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    isSubArray = false;
                    break;
                }
            }
            if (isSubArray) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n1과 n2 입력
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // 배열 A 구성
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        // 배열 B 구성
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        // 결과 출력
        boolean result = isSubArray(A, B);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
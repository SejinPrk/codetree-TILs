import java.util.*;

public class Main {
    // 아름다운 수열의 개수를 세는 함수
    public static int countBeautifulSequences(int[] A, int[] B, int N, int M) {
        // 수열 B를 정렬해 놓음
        Arrays.sort(B);
        
        int count = 0;
        
        // 수열 A에서 길이가 M인 모든 연속 부분 수열을 탐색
        for (int i = 0; i <= N - M; i++) {
            // A의 연속 부분 수열을 추출
            int[] subArray = Arrays.copyOfRange(A, i, i + M);
            
            // 추출한 부분 수열을 정렬
            Arrays.sort(subArray);
            
            // 정렬된 B와 부분 수열이 동일한지 확인
            if (Arrays.equals(subArray, B)) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 수열 A의 길이
        int M = sc.nextInt(); // 수열 B의 길이

        int[] A = new int[N]; // 수열 A
        int[] B = new int[M]; // 수열 B

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        // 아름다운 수열의 개수를 계산
        int result = countBeautifulSequences(A, B, N, M);

        System.out.println(result);
        sc.close();
    }
}
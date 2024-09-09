import java.util.*;

public class Main {
    public static int countBeautifulSequences(int[] A, int[] B, int N, int M) {
        int cnt = 0;

        // 수열 B의 모든 순열을 저장할 Set (중복을 피하기 위함)
        Set<String> permutations = new HashSet<>();
        permute(B, 0, M, permutations);

        // 수열 A에서 길이가 M인 모든 연속 부분 수열을 체크
        for (int i = 0; i <= N - M; i++) {
            int[] subArray = Arrays.copyOfRange(A, i, i + M);
            if (permutations.contains(arrayToString(subArray))) {
                cnt++;
            }
        }
        return cnt;
    }

    // 배열을 문자열로 변환해 순열 비교
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    // 수열의 모든 순열을 구하는 함수    
    public static void permute(int[] array, int l, int r, Set<String> permutations) {
        if (l == r) {
            permutations.add(arrayToString(array));
        } else {
            for (int i = l; i < r; i++) {
                swap(array, l, i);
                permute(array, l + 1, r, permutations);
                swap(array, l, i); // 원상복구
            }
        }
    }

    // 배열의 두 원소를 교환하는 함수
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N]; // 수열 A
        int[] B = new int[M]; // 수열 B

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int result = countBeautifulSequences(A, B, N, M);

        System.out.println(result);
        sc.close();
    }
}
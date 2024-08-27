import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;

        // 세 개의 서로 다른 인덱스 i, j, k에 대해 조건을 검사
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (A[i] <= A[j] && A[j] <= A[k]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
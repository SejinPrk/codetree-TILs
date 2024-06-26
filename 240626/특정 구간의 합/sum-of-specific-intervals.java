import java.util.Scanner;

public class Main {
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int result = calculateSum(a1, a2);
            System.out.println(result);
        }  
    }

    // 수열 A의 a1번째 수부터 a2까지 합
    public static int calculateSum (int a1, int a2) {
        int sum = 0;
        for (int i = a1 -1; i < a2; i++) {
            sum += A[i];
        }
        return sum;
    }
}
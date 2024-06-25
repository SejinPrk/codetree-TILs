import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sumElementsByRule(n, m, arr);
        System.out.println(result);

        sc.close();
    }

    public static int sumElementsByRule(int n, int m, int[] arr) {
        int totalSum = 0;
        while(m > 1) {
            totalSum += arr[m-1]; // m번째 원소 더하기
            if (m % 2 == 0) { // m이 짝수면 2로 나눈다.
                m /= 2; 
            } else { // m이 홀수면 1을 뺀다.
                m -= 1; 
            }
        }
        totalSum += arr[0]; // 마지막으로 m이 1이 되었을 때 첫번째 원소를 더한다.
        return totalSum;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 첫 번째 구간 합 계산
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        // 슬라이딩 윈도우를 이용하여 구간의 합을 갱신하면서 최대합을 찾기
        int currentSum = maxSum;
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k]; // 새로운 값 추가, 이전 값 제거
            maxSum = Math.max(maxSum, currentSum); // 최대합 갱신
        }
        System.out.println(maxSum);
    }
}
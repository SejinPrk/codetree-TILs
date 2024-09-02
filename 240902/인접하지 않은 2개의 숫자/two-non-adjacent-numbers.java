import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 최대 합을 구하는 로직
        int maxSum = 0;

        // 첫 번째 숫자부터 시작해 인접하지 않은 숫자와 합을 계산
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) { // 최소 두 칸 떨어진 숫자
                int currentSum = nums[i] + nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        System.out.println(maxSum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 모든 수의 총합 계산
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        // 최소 차이를 저장할 변수
        int minDiff = Integer.MAX_VALUE;

        // 두 수를 제외하는 모든 조합 계산
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int remainingSum = total - (nums[i] + nums[j]);
                int diff = Math.abs(remainingSum - s);

                // 최소 차이 갱신
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        System.out.println(minDiff);
    }
}
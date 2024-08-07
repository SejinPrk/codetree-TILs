import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxLength = 0;
        int currLength = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] * nums[i - 1] > 0) {
                currLength++;
            } else {
                maxLength = Math.max(maxLength, currLength);
                currLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currLength);

        System.out.println(maxLength);
        sc.close();
    }
}
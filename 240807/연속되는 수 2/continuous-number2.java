import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); 
        } 
        
        int maxCount = 0;
        int currentCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] == nums[i - 1]) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1;
            }
        }
        maxCount = Math.max(maxCount, currentCount);

        System.out.println(maxCount);
        sc.close();
    }
}
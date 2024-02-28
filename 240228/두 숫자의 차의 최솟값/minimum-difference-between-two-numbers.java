import java.util.Scanner; 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(numbers);

        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int difference = numbers[i] - numbers[i - 1];
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        System.out.println(minDifference);
    }
}
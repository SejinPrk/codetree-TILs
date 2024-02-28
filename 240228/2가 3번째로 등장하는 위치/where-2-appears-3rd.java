import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 2) {
                count++;
                if (count == 3) {
                    System.out.println((i + 1));
                    return; 
                }
            }
        }
    }
}
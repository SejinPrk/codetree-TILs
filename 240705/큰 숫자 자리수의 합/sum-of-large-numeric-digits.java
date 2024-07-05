import java.util.Scanner;

public class Main {
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int mul = arr[0] * arr[1] * arr[2];

        int sumOfDigits = sumDigits(mul);
        
        System.out.println(sumOfDigits);
    }
}
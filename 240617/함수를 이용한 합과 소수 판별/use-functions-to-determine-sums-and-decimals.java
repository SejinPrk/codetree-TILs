import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(countSpecialPrimes(a, b));
    }

    // 소수이면서 모든 자릿수의 합이 짝수인 수의 개수를 구하는 함수
    public static int countSpecialPrimes(int a, int b) {
        int cnt = 0;
        
        for (int i = a; i <= b; i++) {
         if (isPrime(i) && isDigitSumEven(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 모든 자릿수의 합이 짝수인 수 판별 함수
    public static boolean isDigitSumEven(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 2 == 0;
    }
}
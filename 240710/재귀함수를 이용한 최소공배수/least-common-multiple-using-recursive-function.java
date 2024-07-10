import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = lcmArray(arr, n);
        System.out.println(result);
    }

    // 최대 공약수 계산
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수 계산
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 배열의 최소 공배수 계산
    public static int lcmArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return lcm(arr[n - 1], lcmArray(arr, n - 1));
    }
}
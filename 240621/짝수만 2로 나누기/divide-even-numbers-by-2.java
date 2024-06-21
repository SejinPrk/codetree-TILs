import java.util.Scanner;

public class Main {
    // 짝수일 때 2로 나눠서 저장하는 함수
    public static void divideEvenNo(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] /=2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divideEvenNo(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
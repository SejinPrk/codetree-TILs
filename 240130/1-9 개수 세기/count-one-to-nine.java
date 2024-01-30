import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] countArr = new int[10];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(countArr[i]);
        }
    }
}
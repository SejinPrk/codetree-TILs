import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[102];
        long cnt = 0;

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (minVal > arr[i]) {
                cnt++;
                minVal = arr[i];
                
            }
        }

        System.out.println(minVal + " " + cnt);
    }
}
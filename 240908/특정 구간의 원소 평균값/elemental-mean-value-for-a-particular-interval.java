import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k]; // 구간 합 계산
                }
                // 구간 평균 계산
                double avg = (double) sum / (j - i + 1);
                
                for (int k = i; k <= j; k++) {
                    if (arr[k] == avg) {
                        cnt++;
                        break; 
                    }
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
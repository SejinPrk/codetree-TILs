import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[][] arr = new int[n][m];

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                 arr[j][i] = cnt;
                 cnt++;
                }
            } else {
                for (int j = n-1; j>=0; j--) {
                    arr[j][i] = cnt;
                    cnt++;
                }
            } 
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
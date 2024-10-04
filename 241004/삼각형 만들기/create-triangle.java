import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static int area(int i, int j, int k) {
        return Math.abs((x[i] * (y[j] - y[k]) + x[j] * (y[k] - y[i]) + x[k] * (y[i] - y[j])));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == j) continue;
                for(int k = 0; k < n; k++) {
                    if (k == i || k == j) continue; 
                    
                    // x축과 y축에 평행한 변을 가지는지 확인
                    if ((x[i] == x[j]) || (y[j] == y[k])) {
                        maxArea = Math.max(maxArea, area(i, j, k));
                    }
                }
            }
        }
        
        System.out.println(maxArea);
        sc.close();
    }
}
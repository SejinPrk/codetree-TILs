import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = 1;
    int[][] placed = new int[10][10];

    for (int i = 0; i < m; i++) {
     int r = sc.nextInt();
     int c = sc.nextInt();
        placed[r][c] = k;
        k++;
    }

    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++){
            System.out.print(placed[i][j] + " ");
        }
        System.out.println();
    } 
    }
}
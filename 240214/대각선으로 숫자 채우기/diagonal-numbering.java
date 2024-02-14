import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 1;
        int[][] arr = new int[100][100];

    for(int startCol = 0; startCol < m; startCol++) {
            int currRow = 0;
            int currCol = startCol;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = cnt;
                currRow++;
                currCol--;
                cnt++;
            }
        }
        
        for(int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m - 1;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = cnt;
                currRow++;
                currCol--;
                cnt++;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            } 
            System.out.println();
        }
    } 
}
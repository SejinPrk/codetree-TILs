import java.util.Scanner;

public class Main {
    public static final int MAX_N = 15;

    public static int R, C;
    public static char[][] grid = new char[MAX_N][MAX_N];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        for(int i = 0; i < R; i++)
            for(int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }

        int cnt = 0;
        for(int i = 1; i < R; i++)
            for(int j = 1; j < C; j++)
                for(int k = i + 1; k < R - 1; k++)
                    for(int l = j + 1; l < C - 1; l++)
                        if(grid[0][0] != grid[i][j] && 
                           grid[i][j] != grid[k][l] &&
                           grid[k][l] != grid[R - 1][C - 1])
                            cnt++;
        
        System.out.println(cnt);
    }
}
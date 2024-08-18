import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] dx = {0, 1, 0, -1}; // N, E, S, W
    static int[] dy = {1, 0, -1, 0}; // N, E, S, W
    static int x = 0, y = 0;
    static int time = 0;

    static int getDirection(String dir) {
        switch (dir) {
            case "N": return 0;
            case "E": return 1;
            case "S": return 2;
            case "W": return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dirStr = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());
            int dir = getDirection(dirStr);

            for (int j = 0; j < distance; j++) {
                x += dx[dir];
                y += dy[dir];
                time++;

                if (x == 0 && y == 0) {
                    System.out.println(time);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
import java.util.Scanner;

public class Main {
    // 방향에 따른 x, y 좌표 변화량
    private static final int[] dx = {-1, 0, 0, 1};
    private static final int[] dy = {0, -1, 1, 0};

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, y = 0; // 시작 위치
        int N = sc.nextInt(); // 이동 횟수

        for (int i = 0; i < N; i++) {
            String dir = sc.next();
            int dist = sc.nextInt();

            int dirIndex = getDirectionIndex(dir);
            x += dx[dirIndex] * dist;
            y += dy[dirIndex] * dist;
        }

        System.out.println(x + " " + y);
        sc.close();
    }

    private static int getDirectionIndex(String direction) {
        switch (direction) {
            case "W" : return 0;
            case "S" : return 1;
            case "N" : return 2;
            case "E" : return 3;
            default : return -1;
        }
    }
}
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.nextLine();
        
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // N, E, S, W

        int x = 0, y = 0, dir = 0; // (x, y) 좌표, 현재 방향(N)
        int time = 0;
        
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            if (command == 'F') {
                // 현재 방향으로 한 칸 전진
                x += direction[dir][0];
                y += direction[dir][1]; 
                time++;
            } else if (command == 'L') {
                // 왼쪽으로 90도 회전 (현재 -1)
                dir = (dir + 3) % 4;
                time++; 
            } else if (command == 'R') {
                // 오른쪽으로 90도 회전 (현재 +1)
                dir = (dir + 1) % 4;
                time++;
            }

            // (0, 0)으로 돌아왔는지 체크
            if (x == 0 && y == 0) {
                System.out.println(time);
                sc.close();
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }
}
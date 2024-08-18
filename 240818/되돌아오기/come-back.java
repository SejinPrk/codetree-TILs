import java.util.Scanner;

public class Main {
    public static final int DIR_NUM = 4;    
    public static int n, x, y;
    public static int[] dx = new int[]{1, -1,  0, 0}; // E, W, S, N
    public static int[] dy = new int[]{0,  0, -1, 1}; // E, W, S, N
    public static int ans = -1;
    public static int elapsedTime; // 지금까지 걸린 시간
    
    // dir 방향으로 dist 만큼 이동하는 함수
    // 만약 시작지에 도달하면 true를 반환
    public static boolean move(int dir, int dist) {
        while(dist-- > 0) {
            x += dx[dir];
            y += dy[dir];
            
            // 이동시간 기록
            elapsedTime++;
    
            // 시작지로 다시 돌아오면 답을 갱신
            if(x == 0 && y == 0) {
                ans = elapsedTime;
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while(n-- > 0) {
            char cDir = sc.next().charAt(0);
            int dist = sc.nextInt();
            
            int dir;
            switch(cDir) {
                case 'E':
                    dir = 0;
                    break;
                case 'W':
                    dir = 1;
                    break;
                case 'S':
                    dir = 2;
                    break;
                case 'N':
                    dir = 3;
                    break;
                default:
                    dir = -1;
                    break;
            }
            
            // 주어진 방향대로 dist 만큼 위치를 이동
            boolean done = move(dir, dist);
            
            // 시작 위치에 도달 -> 종료
            if(done)
                break;
        }
        
        System.out.print(ans);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.nextLine();

        int x = 0, y = 0; // 시작 위치
        int dirNum = 0; // 시작 방향 (북)
        int[] dx = {0, 1, 0, -1}; // 북, 동, 남, 서
        int[] dy = {1, 0, -1, 0}; // 북, 동, 남, 서

        for (char command : commands.toCharArray()) { // 4로 나눠서 0~3 사이의 값을 유지
            switch (command) {
                case 'L':  
                    dirNum = (dirNum - 1 + 4) % 4; // 왼쪽으로 90도 회전 -> 음수 처리 방지를 위해 4를 더함
                    break;
                case 'R':
                    dirNum = (dirNum + 1) % 4; // 오른쪽으로 90도 회전 
                    break;
                case 'F':
                    x += dx[dirNum]; // 현재 방향으로 이동
                    y += dy[dirNum];
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}
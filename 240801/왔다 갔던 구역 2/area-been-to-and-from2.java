import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        final int OFFSET = 1000;
        int[] visited = new int[2001];

        int currPosition = OFFSET; // 시작 위치 (0)

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            String direction = command[1];

            if (direction.equals("L")) { // 왼쪽
                for (int j = 1; j <= distance; j++) {
                    currPosition--;
                    visited[currPosition]++;
                }
            } else { // 오른쪽
                for (int j = 1; j <= distance; j++) {
                    currPosition++;
                    visited[currPosition]++;
                }
            }
        }

        // 2번 이상 방문한 영역의 크기 계산
        int result = 0;
        for (int cnt : visited) {
            if (cnt >= 2) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
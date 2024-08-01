import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        final int OFFSET = 10000; // 음수 좌표를 양수 인덱스로 변환
        int[] visited = new int[20001]; // -10000 ~ 10000 범위 커버

        int currentPosition = OFFSET; // 시작 위치 (0)

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            String direction = command[1];

            if (direction.equals("L")) {
                for (int j = 1; j <= distance; j++) {
                    currentPosition--;
                    visited[currentPosition]++;
                }
            } else { // direction.equals("R")
                for (int j = 1; j <= distance; j++) {
                    currentPosition++;
                    visited[currentPosition]++;
                }
            }
        }

        // 2번 이상 지나간 영역의 크기 계산
        int result = 0;
        for (int count : visited) {
            if (count >= 2) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
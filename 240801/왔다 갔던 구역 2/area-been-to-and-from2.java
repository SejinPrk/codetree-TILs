import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        Map<Integer, Integer> visited = new HashMap<>(); // 위치와 방문 횟수
        int currentPosition = 0; // 시작 위치 (0)

        // 시작 위치 방문
        visited.put(currentPosition, 1);

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            String direction = command[1];

            if (direction.equals("L")) {
                for (int j = 0; j < distance; j++) {
                    currentPosition--;
                    visited.put(currentPosition, visited.getOrDefault(currentPosition, 0) + 1);
                }
            } else { // direction.equals("R")
                for (int j = 0; j < distance; j++) {
                    currentPosition++;
                    visited.put(currentPosition, visited.getOrDefault(currentPosition, 0) + 1);
                }
            }
        }

        // 2번 이상 지나간 영역의 크기 계산
        int result = 0;
        for (int count : visited.values()) {
            if (count >= 2) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
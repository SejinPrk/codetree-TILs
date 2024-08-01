import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비
        
        // 현재 위치와 방문 횟수를 저장할 해시맵 초기화
        HashMap<Integer, Integer> visitedMap = new HashMap<>();
        int currentPosition = 0;
        
        // n개의 명령을 처리
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] parts = command.split(" ");
            int distance = Integer.parseInt(parts[0]);
            String direction = parts[1];
            
            if (direction.equals("L")) {
                for (int j = 0; j < distance; j++) {
                    currentPosition--;
                    visitedMap.put(currentPosition, visitedMap.getOrDefault(currentPosition, 0) + 1);
                }
            } else if (direction.equals("R")) {
                for (int j = 0; j < distance; j++) {
                    currentPosition++;
                    visitedMap.put(currentPosition, visitedMap.getOrDefault(currentPosition, 0) + 1);
                }
            }
        }
        
        // 2번 이상 지나간 영역의 크기 계산
        int count = 0;
        for (int visits : visitedMap.values()) {
            if (visits >= 2) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        scanner.close();
    }
}
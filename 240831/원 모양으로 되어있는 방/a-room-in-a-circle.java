import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 방의 개수
        int[] people = new int[n];

        // 각 방에 들어가야 하는 인원
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        int minDistanceSum = Integer.MAX_VALUE; // 최소 거리 

        // 각 방을 출발지로 설정해 계산
        for (int start = 0; start < n; start++) {
            int distanceSum = 0;
            
            // 각 방에 대한 거리 계산
            for (int i = 0; i < n; i++) {
                int distance = (i - start + n) % n; // 거리: (i - 출발 방번호) % n
                distanceSum += distance * people[i];
            }

            // 최소 거리 합 갱신
            minDistanceSum = Math.min(minDistanceSum, distanceSum);
        }
        System.out.println(minDistanceSum);
        sc.close();
    }
}
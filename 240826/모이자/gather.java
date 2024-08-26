import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 집의 수
        int[] A = new int[n]; // 각 집에 사는 사람의 수

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE; // 이동거리 합의 최소값

        for(int i = 0; i < n; i++) {
            int totalDistance = 0; 

            // 모든 집에 대해 이동 거리 계산
            for (int j = 0; j < n; j++) {
                totalDistance += A[j] * Math.abs(i - j);
            }

            // 최소 이동거리 갱신
            if (totalDistance < minDistance) {
                minDistance = totalDistance;
            }
        }
        
        System.out.println(minDistance);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // 최소 비용을 매우 큰 값으로 초기화
        int minCost = Integer.MAX_VALUE;

        // 모든 시작점에서 t개의 연속 구간 확인
        for (int i = 0; i <= n - t; i++) {
            int currCost = 0;

            // 해당 구간의 높이를 h로 맞추기 위한 비용 계산
            for (int j = i; j < i + t; j++) {   
                currCost += Math.abs(heights[j] - h);
            }

            minCost = Math.min(minCost, currCost); // 최소 비용 갱신
        }
        System.out.println(minCost);
        sc.close();
    }
}
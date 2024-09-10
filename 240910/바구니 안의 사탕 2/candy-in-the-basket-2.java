import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<int[]> baskets = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int candyCount = sc.nextInt();
            int position = sc.nextInt();
            baskets.add(new int[]{candyCount, position});
        }
        
        int maxCandies = 0;  // 최대 사탕 수를 저장할 변수
        
        // 중심점 c를 가능한 모든 위치에서 설정(0 <= c <= 100)
        for (int c = 0; c <= 100; c++) {
            int currentCandies = 0;
            
            // 각 바구니에 대해 그 바구니가 구간 [c-K, c+K]에 포함되는지 확인
            for (int[] basket : baskets) {
                int candyCount = basket[0];
                int position = basket[1];
                
                // 바구니의 위치가 [c-K, c+K]에 속하는지 확인
                if (position >= c - K && position <= c + K) {
                    currentCandies += candyCount;
                }
            }
            
            // 최대 사탕 수 갱신
            maxCandies = Math.max(maxCandies, currentCandies);
        }
    
        System.out.println(maxCandies);
        
        sc.close();
    }
}
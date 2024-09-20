import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] points = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt();  // x 좌표
            points[i][1] = sc.nextInt();  // y 좌표
        }

        // x좌표, y좌표 별로 정렬된 배열을 각각 생성
        int[] xSorted = new int[N];
        int[] ySorted = new int[N];
        
        for (int i = 0; i < N; i++) {
            xSorted[i] = points[i][0];
            ySorted[i] = points[i][1];
        }

        Arrays.sort(xSorted);
        Arrays.sort(ySorted);

        int minArea = Integer.MAX_VALUE;

        // 각 점을 제거하고 남은 점들로 직사각형의 최소 넓이 구하기
        for (int i = 0; i < N; i++) {
            // 해당 점을 제외한 나머지 점들의 x, y 값 중 최소, 최대를 찾아 직사각형의 넓이 계산
            int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
            
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // i 번째 점을 제외

                minX = Math.min(minX, points[j][0]);
                maxX = Math.max(maxX, points[j][0]);
                minY = Math.min(minY, points[j][1]);
                maxY = Math.max(maxY, points[j][1]);
            }

            // 남은 점들로 만들 수 있는 직사각형의 넓이 계산
            int area = (maxX - minX) * (maxY - minY);
            minArea = Math.min(minArea, area);
        }

        System.out.println(minArea);
    }
}
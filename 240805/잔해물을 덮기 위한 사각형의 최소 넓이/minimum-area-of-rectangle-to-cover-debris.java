import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 직사각형 입력
        int[] rect1 = new int[4];
        for (int i = 0; i < 4; i++) {
            rect1[i] = scanner.nextInt();
        }

        // 두 번째 직사각형 입력
        int[] rect2 = new int[4];
        for (int i = 0; i < 4; i++) {
            rect2[i] = scanner.nextInt();
        }

        int result = calculateMinCoveringArea(rect1, rect2);
        System.out.println(result);

        scanner.close();
    }

    public static int calculateMinCoveringArea(int[] rect1, int[] rect2) {
        // 겹치는 영역 계산
        int left = Math.max(rect1[0], rect2[0]);
        int right = Math.min(rect1[2], rect2[2]);
        int bottom = Math.max(rect1[1], rect2[1]);
        int top = Math.min(rect1[3], rect2[3]);

        // 겹치는 영역이 있는지 확인
        if (left < right && bottom < top) {
            int minX = rect1[0];
            int maxX = rect1[2];
            int minY = rect1[1];
            int maxY = rect1[3];

            // 왼쪽 영역
            if (rect1[0] < left) {
                maxX = Math.max(maxX, left);
            }
            // 오른쪽 영역
            if (right < rect1[2]) {
                minX = Math.min(minX, right);
            }
            // 아래쪽 영역
            if (rect1[1] < bottom) {
                maxY = Math.max(maxY, bottom);
            }
            // 위쪽 영역
            if (top < rect1[3]) {
                minY = Math.min(minY, top);
            }

            // 잔해물이 없는 경우
            if (minX == maxX || minY == maxY) {
                return 0;
            }

            // 최소 직사각형의 넓이 반환
            return (maxX - minX) * (maxY - minY);
        } else {
            // 겹치는 영역이 없다면 첫 번째 직사각형의 전체 넓이를 반환
            return (rect1[2] - rect1[0]) * (rect1[3] - rect1[1]);
        }
    }
}
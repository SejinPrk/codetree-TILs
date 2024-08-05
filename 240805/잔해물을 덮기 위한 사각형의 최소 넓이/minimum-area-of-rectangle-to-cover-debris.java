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

        int result = calculateRemainingArea(rect1, rect2);
        System.out.println(result);

        scanner.close();
    }

    public static int calculateRemainingArea(int[] rect1, int[] rect2) {
        // 겹치는 영역 계산
        int left = Math.max(rect1[0], rect2[0]);
        int right = Math.min(rect1[2], rect2[2]);
        int bottom = Math.max(rect1[1], rect2[1]);
        int top = Math.min(rect1[3], rect2[3]);

        // 겹치는 영역이 있는지 확인
        if (left < right && bottom < top) {
            // 겹치는 영역이 있다면, 잔해물의 영역을 계산
            int width = Math.max(rect1[2], right) - Math.min(rect1[0], left);
            int height = Math.max(rect1[3], top) - Math.min(rect1[1], bottom);

            // 잔해물이 없는 경우
            if (left <= rect1[0] && right >= rect1[2] && bottom <= rect1[1] && top >= rect1[3]) {
                return 0;
            }

            // 최소 직사각형의 넓이 반환
            return width * height;
        } else {
            // 겹치는 영역이 없다면 첫 번째 직사각형의 전체 넓이를 반환
            return (rect1[2] - rect1[0]) * (rect1[3] - rect1[1]);
        }
    }
}
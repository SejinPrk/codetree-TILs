import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        scanner.close();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // Calculate total days from m1/d1 to m2/d2
        int totalDays = 0;

        // 같은 달의 경우
        if (m1 == m2) {
            totalDays = d2 - d1;
        } else {
            // 첫 달의 남은 일수
            totalDays += daysInMonth[m1 - 1] - d1;
            // 두 번째 달의 일수
            totalDays += d2;
            // 사이의 모든 달의 일수
            for (int i = m1; i < m2 - 1; i++) {
                totalDays += daysInMonth[i];
            }
        }

        // 요일 계산
        int dayIndex = (totalDays % 7 + 7) % 7;

        // 월요일부터 시작: `Mon` (m1, d1)
        int startDayIndex = 0;  // `Mon`: 0
        int finalDayIndex = (startDayIndex + dayIndex) % 7;

        System.out.println(dayNames[finalDayIndex]);
    }
}
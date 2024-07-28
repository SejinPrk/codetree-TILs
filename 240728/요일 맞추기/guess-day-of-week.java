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
        String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int totalDays = 0;

        // m1월 d1일부터 m2월 d2일까지의 날짜 수 계산
        if (m1 == m2) {
            totalDays = d2 - d1;
        } else {
            // m1월의 남은 일수
            totalDays += daysInMonth[m1 - 1] - d1;
            
            // m1+1월부터 m2-1월까지의 일수
            for (int m = m1 + 1; m < m2; m++) {
                totalDays += daysInMonth[m - 1];
            }
            
            // m2월의 일수
            totalDays += d2;
        }

        // 요일 계산 (월요일부터 시작하므로 나머지에 1을 더함)
        int dayIndex = (totalDays % 7 + 1) % 7;
        
        System.out.println(dayNames[dayIndex]);
    }
}
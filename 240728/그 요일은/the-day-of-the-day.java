import java.util.Scanner;

public class Main {
    public static int numOfDays (int m, int d) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }

        totalDays += d;
        return totalDays;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 변수 선언 및 입력
    int m1 = sc.nextInt();
    int d1 = sc.nextInt();
    int m2 = sc.nextInt();
    int d2 = sc.nextInt();
    sc.nextLine(); // 개행문자 제거
    String A = sc.nextLine();

    String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    int targetDayIndex = 0;
    
    for (int i = 0; i < 7; i++) {
        if (daysOfWeek[i].equals(A)) {
            targetDayIndex = i;
            break;
        }
    }

    // 두 날짜 간의 총 일수 계산
    int startDay = numOfDays(m1, d1);
    int endDay = numOfDays(m2, d2);
    int totalDays = endDay - startDay + 1;

    // 목표 요일이 총 몇 번 등장하는지 계산
    int count = 0;
    for (int i = 0; i < totalDays; i++) {
        int currentDayIndex = i % 7;
        if (currentDayIndex == targetDayIndex) {
            count++;
        }
    }
    System.out.println(count);
    }
}
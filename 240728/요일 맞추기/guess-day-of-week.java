import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sat"};
        int totalDays = 0;

        if (m1 == m2) {
           totalDays = d2 - d1;
        } else {
            totalDays += daysInMonth[m1 - 1] - d1;

            for (int m = m1; m < m2 - 1; m++) {
                totalDays += daysInMonth[m - 1];
            }

            totalDays += d2; // m2월의 일수
        }
        
        int dayIndex = (totalDays % 7 + 1) % 7;

        System.out.println(dayNames[dayIndex]);
        sc.close();
    }
}
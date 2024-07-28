import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Mon", "Tue", "Wed","Thu", "Fri", "Sat", "Sun"};
        
        int totalDays = -1;

        if (m1 == m2) {
            totalDays = d2 - d1;
        } else {
            totalDays += daysInMonth[m1] - d1;
            for (int m = m1 + 1; m < m2; m++) {
                totalDays += daysInMonth[m];
            }
            totalDays += d2;
        }

        int dayIndex = (totalDays % 7 + 7) % 7;
        System.out.println(dayNames[dayIndex]);

        sc.close();
    }
}
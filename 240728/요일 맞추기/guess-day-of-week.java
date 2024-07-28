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

        for (int m = m1; m <= m2; m++) {
            int start = (m == m1)? d1 : 1;
            int end = (m == m2) ? d2 : daysInMonth[m];
            totalDays += end - start + 1;
        }
        
        int dayIndex = totalDays % 7;

        System.out.println(dayNames[dayIndex]);

        sc.close();
    }
}
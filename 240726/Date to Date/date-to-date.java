import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        sc.close();

        int totalDays = 0;
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
        if(m1 == m2) {
            totalDays = d2 - d1 + 1; // 시작일 포함
        } else {
            totalDays += num_of_days[m1] - d1 + 1;
            
            for (int month = m1 + 1; month < m2; month++ ){
                totalDays += num_of_days[month];
            }
            totalDays += d2;
        }

        System.out.print(totalDays);
    }
}
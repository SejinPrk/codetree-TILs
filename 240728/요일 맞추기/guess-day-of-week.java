import java.util.Scanner;

public class Main {
    public static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월에 d일이 있음
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
        
        // 두 날짜간의 차이 계산
        int diff = numOfDays(m2, d2) - numOfDays(m1, d1);
        
        // 음수인 경우
        while(diff < 0)
            diff += 7;
        
        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.print(dayOfWeek[diff % 7]);
    }
}
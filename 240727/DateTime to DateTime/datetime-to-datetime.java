import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 분 단위 변환 
        int startTime = 0; // 2011년 11월 11일 11시 11분
        int endTime = (a - 11) * 24 * 60 + (b - 11) * 60 + (c - 11); // 2011년 11월 a일 b시 c분부터의 경과 시간

        if (endTime < 0) {
            System.out.println(-1);
        } else {
            System.out.println(endTime);
        }

        sc.close();
    }
}
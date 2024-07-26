import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        sc.close();

        // 시간을 분으로 변환
        int startTime = a * 60 + b;
        int endTime = c * 60 + d;
    
        int elapsedTime = 0;

        if (endTime >= startTime) {
            elapsedTime = endTime - startTime;
        } 
        // else { // 자정을 지날 경우
        //     elapsedTime = (24 * 60 - startTime) + endTime;
        // }
        
        System.out.print(elapsedTime);
    }
}
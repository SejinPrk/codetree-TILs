import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        compareNo(a, b);
    }

    // 숫자 비교하기
    public static void compareNo(int a, int b) {
        if (a > b) {
            a += 25;
            b *= 2;
        } else {
            a *= 2;
            b += 25;
        }
        System.out.println(a + " " + b);
    }
}
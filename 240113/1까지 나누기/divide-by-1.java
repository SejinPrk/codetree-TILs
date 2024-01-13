import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int num = n;

        for (int i = 1; i <= n; i++) {
            if (num <= 1) {
                System.out.println(cnt);
                break;
            }
            num /= i;
            cnt++;
        }
    }
}
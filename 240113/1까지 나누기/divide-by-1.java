import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int num = n;

        for (int i = 1; i <= n; i++) {
            num /= i;
            cnt++;
            if (num <= 1) {
                break;
            }
        }
        System.out.println(cnt-1);
    }
}
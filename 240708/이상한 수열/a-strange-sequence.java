import java.util.Scanner;

public class Main {
    public static int strangeNum(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return strangeNum(n/3) + strangeNum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = strangeNum(n);

        System.out.println(result);
    }
}
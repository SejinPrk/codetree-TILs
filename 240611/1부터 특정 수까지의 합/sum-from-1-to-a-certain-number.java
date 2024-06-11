import java.util.Scanner;

public class Main {
    public static void printRect(int n) {
        int cnt = 1;
        for(int i = 1; i <= n; i++) {
            cnt+= i;
        }
        System.out.println(cnt/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
    }
}
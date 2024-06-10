import java.util.Scanner;

public class Main {
    public static void gcd(int n, int m) {
        int max = 0;
        for(int i = 1; i <= n && i <= m; i++) {
            if(n % i == 0 && m % i == 0){
                max = i;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gcd(n, m);
    }
}
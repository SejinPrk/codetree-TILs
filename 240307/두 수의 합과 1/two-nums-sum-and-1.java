import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int cnt = 0;
        while (sum > 0) {
            if (sum % 10 == 1) {
                cnt++;
            }
            sum /= 10;
    }
        System.out.println(cnt);
    }    
}
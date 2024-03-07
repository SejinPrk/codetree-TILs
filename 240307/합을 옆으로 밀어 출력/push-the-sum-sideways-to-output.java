import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        String str = Integer.toString(sum);
        int len = str.length();

        System.out.println(str.substring(1, len) + str.substring(0, 1));
    }
}
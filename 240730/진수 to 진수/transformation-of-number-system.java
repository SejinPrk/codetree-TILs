import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int decimal = 0;

        for (int i = 0; i < n.length(); i++) {
            decimal = decimal * a + (n.charAt(i) - '0');
        }

        // 10진수 -> b진수
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.insert(0, decimal % b);
            decimal /= b;
        }

        System.out.println(result.length() > 0? result.toString() : "0");

        sc.close();
    }
}
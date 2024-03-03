import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            char operation = sc.next().charAt(0);
            if (operation == '1') {
                s = s.substring(1) + s.charAt(0);
            } else if (operation == '2') {
                s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            } else if (operation == '3') {
                s = new StringBuilder(s).reverse().toString();
            }
            System.out.println(s);
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int L = s.length();
            System.out.println(s);

            for (int i = 0; i < L; i++) {
            s = s.substring(L - 1, L) + s.substring(0, L - 1);
            System.out.println(s);
        }
    }
}
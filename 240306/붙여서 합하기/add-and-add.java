import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String AB = A + B;
        String BA = B + A;
        int sum = Integer.parseInt(AB) + Integer.parseInt(BA);

        System.out.println(sum);
    }
}
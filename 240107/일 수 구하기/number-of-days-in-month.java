import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m == 1 || m == 3 || m == 5 || m == 7 || m ==8 || m == 10 || m == 12) {
                System.out.println("31");
        } else if ( m == 2) {
                System.out.println("28");
        } else{
            System.out.println("30");
        }
    }
}
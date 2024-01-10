import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 1;

        if (a >= 1) {
            for (i = a; i <= b+1; i++) {
                System.out.print(a);
            }
        } else {
               System.out.println("0");
        }
    }
}
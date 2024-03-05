import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a == 'a') {
            System.out.println('z');
        } else {
            System.out.println((char) (a - 1));
        }
    }
}
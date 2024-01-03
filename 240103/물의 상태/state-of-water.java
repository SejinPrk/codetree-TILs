import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();

        if (degree < 0) {
            System.out.println("ice");
        }
        else if (degree >= 100) {
            System.out.println("vapor");
        }
        else {
            System.out.println("water");
        }
    }
}
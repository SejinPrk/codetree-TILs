import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = sc.nextDouble();

        if (avg >= 1.0) {
            System.out.println("High");
        }
        else if (avg >= 0.5) {
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }
    }
}
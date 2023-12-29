import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); 
        int first = sc.nextInt();
        int middle = sc.nextInt();
        int last = sc.nextInt();

        System.out.println("0" + first + "-" + last + "-" + middle);
    }
}
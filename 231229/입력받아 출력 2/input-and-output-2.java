import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-"); 
        int first = sc.nextInt();
        int last = sc.nextInt();

        System.out.printf("%d%d\n", first, last);
    }
}
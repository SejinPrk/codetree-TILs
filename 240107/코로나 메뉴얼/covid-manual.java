import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1, c2, c3;
        int t1, t2, t3;

        c1 = sc.next().charAt(0);t1 = sc.nextInt();
        c2 = sc.next().charAt(0);
        t2 = sc.nextInt();
        c3 = sc.next().charAt(0);
        t3 = sc.nextInt();

        if(c1 == 'Y' && t1 >= 37) {
            if((c2 == 'Y' && t2 >= 37) || (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
        else {
            if((c2 == 'Y' && t2 >= 37) && (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " ");

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                i*=2;
                System.out.print(i + " ");
            }
            else if(i%2 == 0) {
                i+=3;
                System.out.print(i +" ");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static int minN(int a, int b, int c) {
       int min = a; 
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(minN(a, b, c));
    }
}
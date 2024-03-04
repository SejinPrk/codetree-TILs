import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);
        char B = sc.next().charAt(0);

        int a = (int)A;
        int b = (int)B;
        System.out.print(a+b + " ");
        if(a > b) {
            System.out.println(a-b);
        } else {
            System.out.println(b-a);
        }
        
    }
}
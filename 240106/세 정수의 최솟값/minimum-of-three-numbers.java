import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       
        // a가 가장 작은 경우
        if(a <= b && a <= c) {
            System.out.println(a);
        }
        // b가 가장 작은 경우
        else if(b <= a && b <= c) {
            System.out.println(b);
        }
        // c가 가장 작은 경우
        else {
            System.out.println(c);
        }
        }
    }
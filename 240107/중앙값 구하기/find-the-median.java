import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((b>a && a<c) ||(a<c && a>b) ){
            System.out.println(a);
        } else if ((b<a && b>c) || (b<c && b>a)) {
            System.out.println(b);
        } else if ((c>a && c<b) || (c<a && c>b)){
            System.out.println(c);
        }
    }
}
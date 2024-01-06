import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;

        if(a>b){
            if(c>b){
                min = b;
                System.out.println(b);
            } else{
                min = c;
                System.out.println(c);
            }
        }else{
            if(c>a){
                min = a;
                System.out.println(a);
            } else{
                min = c;
                System.out.println(c);
            }
        }
    }
}
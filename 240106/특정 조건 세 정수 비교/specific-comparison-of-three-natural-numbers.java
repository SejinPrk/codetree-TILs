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
            } else{
                min = c;
            }
        }else{
            if(c>a){
                min = a;
            } else{
                min = c;
            }
        }

        if (a == min) {
            System.out.print("1");
        }
        else {
            System.out.print("0");
        }

        if(a==b && b==c && a==c){
            System.out.println(" 1");
        }else{
            System.out.println(" 0");
        }
    }
}
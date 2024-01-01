import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<5){
            System.out.println("tiny");
            System.out.println(n*n);
        }else{
            System.out.println(n*n);
        }
    }
}
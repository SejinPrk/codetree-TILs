import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);             
    }

    public static void printStar(int n) {
        if(n == 0)
            return;
        
        for(int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println();

        for(int i = n; i >= 1; i--)
            System.out.print(i + " ");

    }
}
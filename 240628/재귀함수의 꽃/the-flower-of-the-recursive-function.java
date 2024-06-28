import java.util.Scanner;
public class Main {
    public static void printRecursive(int n) {  
        if (n > 0) {
            System.out.print(n + " ");
        printRecursive(n - 1);
            System.out.print(n + " ");
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRecursive(n);
    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // i가 홀수인 경우 1 + (i / 2), 짝수인 경우 n - (i / 2)
        for(int i = 0; i < 2 * n; i++) {
            if(i % 2 == 1) {
                for(int k = 0; k < 1 + i / 2; k++)
                    System.out.print("* ");
            }
            else {
                for(int k = 0; k < n - i / 2; k++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
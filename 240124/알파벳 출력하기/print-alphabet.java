import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char x = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(x == 'Z'){
                System.out.print(x);
                x = 'A';
                } else {
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println();
        }
    }
}
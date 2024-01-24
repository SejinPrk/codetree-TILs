import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char x = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
            if(x == 'z'){
                x = 'A';
            }
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char x = 'A';

        for(int i = 0; i < n; i++){
            for(int j = 1; j < i+1; j++){
                System.out.print("  ");
            }
            for(int j =0; j<n-i; j++){
                if(x == 'Z'){
                    System.out.print((char)x++ + " ");
                    x = 'A';
                } else {
                    System.out.print((char)x++ + " ");
                }
                
            }
            System.out.println();
        }
    }
}
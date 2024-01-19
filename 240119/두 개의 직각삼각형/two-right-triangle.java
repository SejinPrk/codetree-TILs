import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++) System.out.print("*");
            for(int k=0; k<i*2-2; k++) System.out.print(" ");
            for(int l=0; l<n-i+1; l++) System.out.print("*");
            System.out.println();
    }

    }
}
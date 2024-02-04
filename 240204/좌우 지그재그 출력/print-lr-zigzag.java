import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            if (i%2 == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(cnt + " ");   
                    if (j != n){
                        cnt++;
                     }
                    }
                }
            else {
                cnt += n;
                for(int j = 1; j <= n; j++) {
                    System.out.print(cnt + " ");
                    if (j != n){
                        cnt--;
                    }
                }
                cnt += n;
            }        
            System.out.println();
        }
    }
}
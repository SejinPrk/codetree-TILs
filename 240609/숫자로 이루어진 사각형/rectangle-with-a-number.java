import java.util.Scanner;

public class Main {
    public static void printRect(int n) {
        int cnt = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(cnt + " ");
                cnt++;
                if(cnt == 10)
                    cnt = 1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printRect(rowNum);
    }
}
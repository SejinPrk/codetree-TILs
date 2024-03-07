import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.nextLine();
        int cnt = 0; 

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if (A.equals(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
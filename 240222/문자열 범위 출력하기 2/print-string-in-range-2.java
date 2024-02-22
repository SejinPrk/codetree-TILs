import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = str.length()-1; i >= 0; i--){
            if (cnt >= n) {
                break;
            }
            System.out.print(str.charAt(i));
            cnt++;
        }
    }
}
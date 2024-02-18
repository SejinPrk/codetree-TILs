import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = sc.next();
        int cnt = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a.charAt(0)) 
            cnt++;
        }

        System.out.println(cnt);
        
    }
}
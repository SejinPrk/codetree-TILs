import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt1 = 0; 
        int cnt2 = 0;
        int len = str.length();

        for(int i = 0; i < len - 1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'e')
                cnt1++;
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'b')
                cnt2++;
        }
    System.out.println(cnt1 + " " + cnt2);
    }
}
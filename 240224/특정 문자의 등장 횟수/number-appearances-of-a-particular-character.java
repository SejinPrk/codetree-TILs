import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt1 = 0; 
        int cnt2 = 0;

        if (s.contains("ee")){
            cnt1++;
        }
        if (s.contains("eb")){
            cnt2++;
        }
        System.out.println(cnt1 + " " + cnt2);
    }
}
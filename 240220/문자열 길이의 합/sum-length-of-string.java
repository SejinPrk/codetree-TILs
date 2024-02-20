import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        int cnt = 0;
        int sum = 0; 

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
            sum += str[i].length();
        }

        for(int i = 0; i < n; i++) {
            if(str[i].charAt(0) == 'a')
                    cnt++;
        }
    
    
        System.out.println(sum + " " + cnt);
    }
}
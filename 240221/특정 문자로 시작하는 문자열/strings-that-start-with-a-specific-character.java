import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[20];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        
        char a = sc.next().charAt(0);

        for(int i = 0; i < n ; i++) {
            if(str[i].charAt(0) == a){
                cnt++;
                sum += str[i].length();
            }
        }
        System.out.printf("%d %.2f\n", cnt, (double)sum/cnt);
    }
}
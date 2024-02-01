import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[100];
        int[] cnt = new int[100];
        
        for (int i = 1; i < 100; i++) {
            arr[i] += a%b;
            cnt[arr[i]]++;
            a/=b;
            if (a <= 1) {
                break;
            }
        }

        int sum  = 0;
         for (int i = 0; i < b; i++) {  
            sum += cnt[i] * cnt[i];
        }
        System.out.print(sum + " ");
    }
}
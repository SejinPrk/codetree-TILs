import java.util.Scanner; 

 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int n = sc.nextInt();
            sum += n;
            cnt++;
        }
        System.out.printf("%d %.1f\n",sum, (double)sum/cnt);
    }
}
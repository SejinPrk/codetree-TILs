import java.util.Scanner;

public class Main {
    public static boolean contains369(int i) {
        String str = Integer.toString(i);
        return str.contains("3") || str.contains("6") || str.contains("9");
    }

    public static int count369Multiples(int a, int b) {
        int cnt = 0;
            for(int i = a; i <= b; i++) {
                if(contains369(i) || i % 3 == 0)
                    cnt++;
            }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = count369Multiples(a, b);
        
        System.out.println(result);
    }
}
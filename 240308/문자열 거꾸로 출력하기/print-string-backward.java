import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            String str = sc.nextLine();
            if (str.equals("END")) {
                break;
            } else {
                StringBuilder sb = new StringBuilder(str).reverse();
                System.out.println(sb.toString());
            }
        }
        
        sc.close();
    }
}
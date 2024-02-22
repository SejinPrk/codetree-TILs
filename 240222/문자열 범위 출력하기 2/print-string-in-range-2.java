import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = str.length()-1; i > str.length()-n-1; i--){
            System.out.print(str.charAt(i));
            if (n > str.length()) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
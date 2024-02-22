import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int idx = str.length() - 1;
        if(idx % 2 == 0) idx--;

        for(int i = idx; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
    }
}
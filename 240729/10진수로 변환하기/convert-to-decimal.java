import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        int num = 0;

        for(int i = 0; i < binaryString.length(); i++) {
            num = num * 2 + (binaryString.charAt(i) - '0');
        }

        System.out.print(num);
    }
}
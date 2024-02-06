import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] arr = new char[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                String temp = sc.next();
                char a = (char)temp.charAt(0);
                arr[i][j] = a;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%c ", arr[i][j] - 32);
            }
            System.out.println();
        }
    }
}
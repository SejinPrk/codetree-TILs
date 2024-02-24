import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length()-2;
        arr[1] = 'a';
        arr[len] = 'a';
        s = String.valueOf(arr);

        System.out.println(s);
    }
}
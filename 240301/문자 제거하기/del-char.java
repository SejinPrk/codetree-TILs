import java.util.Scanner;

public class Main {
    public static String removeCharAtIndex(String str, int index) {
        if (index < str.length()) {
            return str.substring(0, index) + str.substring(index + 1);
        } else {
            return str.substring(0, str.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         String str = sc.nextLine();

        while (str.length() > 1) {
            int index = sc.nextInt();
            str = removeCharAtIndex(str, index);
            System.out.println(str);
        }

 
    }
}
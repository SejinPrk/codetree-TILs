import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[200];
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                strings[count++] = input;
            }
        }
        
        System.out.println(count);
        for (int i = 0; i < count; i += 2) {
            System.out.println(strings[i]);
        }
        
        scanner.close();
    }
}
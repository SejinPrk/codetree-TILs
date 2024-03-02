import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = removeFirstE(input);
        System.out.println(result);
    }

    public static String removeFirstE(String input) {
        int index = input.indexOf('e');
        if (index != -1) { // 'e'가 문자열에 존재하는 경우
            return input.substring(0, index) + input.substring(index + 1);
        }
        return input; // 'e'가 문자열에 존재하지 않는 경우
    }
}
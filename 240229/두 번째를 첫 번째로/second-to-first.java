import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] characters = input.toCharArray();

        char firstChar = characters[0];
        char secondChar = characters[1];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == secondChar) {
                characters[i] = firstChar;
            }
        }
        System.out.println(characters);
    }
}
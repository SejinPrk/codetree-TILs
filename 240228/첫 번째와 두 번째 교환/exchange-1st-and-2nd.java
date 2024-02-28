import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // 문자열을 문자 배열로 변환
        char[] characters = input.toCharArray();

        // 첫 번째 문자와 두 번째 문자 교체
        char firstChar = characters[0];
        char secondChar = characters[1];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == firstChar) {
                characters[i] = secondChar;
            } else if (characters[i] == secondChar) {
                characters[i] = firstChar;
            }
        }

        // 변형된 문자열 출력
        System.out.println(characters);
    }
}
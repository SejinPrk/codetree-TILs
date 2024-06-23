import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        if(twoDistinctCharacters(A)) {
            System.out.println("Yes"); 
        } else {
            System.out.println("No");
        }
    }

    public static boolean twoDistinctCharacters(String s) {
        // 첫 번째 다른 문자
        char firstChar = s.charAt(0);
        boolean foundSecondChar = false;

        // 두 번째 다른 문자가 있는지 확인
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                foundSecondChar = true;
                break;
            }
        }
        return foundSecondChar;
    }
}
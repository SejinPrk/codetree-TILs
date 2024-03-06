import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                // 대문자일 경우 소문자로 변환
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                // 소문자일 경우 대문자로 변환
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
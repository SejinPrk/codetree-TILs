import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String result = convertToUppercase(inputString);
        System.out.println(result);
    }
    
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) { 
                result.append(Character.toUpperCase(ch));
            }
        }
        
        return result.toString();
    }
}
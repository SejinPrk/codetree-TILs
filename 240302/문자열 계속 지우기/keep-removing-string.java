import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        
        String result = removeSubstring(A, B);
        System.out.println(result);
    }
    
    public static String removeSubstring(String A, String B) {
        while (A.contains(B)) {
            int index = A.indexOf(B);
            A = A.substring(0, index) + A.substring(index + B.length());
        }
        return A;
    }
}
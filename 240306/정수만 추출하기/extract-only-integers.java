import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int intA = parseInt(A);
        int intB = parseInt(B);
        int sum = intA + intB;
        System.out.println(sum);
    }

        // 문자열에서 정수로 변환 가능한 부분을 찾기
public static int parseInt(String str) {
    int result = 0;
    int i = 0;

    while (i < str.length() && Character.isDigit(str.charAt(i))) {
        result = result * 10 + (str.charAt(i) - '0');
        i++;
        
        }
        return result;
    }
}
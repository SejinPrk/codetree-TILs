import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // 입력받은 문자열을 문자 배열로 전환
        char[] charArray = input.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(charArray);
        
        // 정렬된 문자 배열을 문자열로 변환
        String sortedString = new String(charArray);
        System.out.println(sortedString);
    }
}
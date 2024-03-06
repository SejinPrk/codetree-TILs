import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int num1 = extractNumber(str1);
        int num2 = extractNumber(str2);
        int sum = num1 + num2;

        System.out.println(sum);
        
        sc.close();
    }

    // 문자열에서 숫자 부분을 추출하여 정수로 변환하는 함수
    public static int extractNumber(String str) {
        StringBuilder numStr = new StringBuilder();

        // 문자열을 순회하면서 숫자 부분 추출
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numStr.append(str.charAt(i));
            }
        }
        return Integer.parseInt(numStr.toString());
    }
}
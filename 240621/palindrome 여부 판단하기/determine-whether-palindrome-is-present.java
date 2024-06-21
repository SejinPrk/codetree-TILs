import java.util.Scanner;

public class Main {
    // 문자열 A가 Palindrom인지를 판단하는 함수
    public static boolean isPalindrome(String A) {
        int left = 0;
        int right = A.length() - 1;

        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        
        // 회문인지 여부 검사 후 결과 출력
        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
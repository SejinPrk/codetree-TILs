import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        sc.close();

        int n = A.length();
        int cnt = 0;
        // 여는 괄호 "((" 탐색
        for (int i = 0; i < n - 3; i++) {
            if (A.charAt(i) == '(' && A.charAt(i + 1) == '(') {
                // 닫는 괄호 "))" 탐색 (여는 괄호 이후)
                for (int j = i + 2; j < n - 1; j++) {
                    if (A.charAt(j) == ')' && A.charAt(j + 1) == ')') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
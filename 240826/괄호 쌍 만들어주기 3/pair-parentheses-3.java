import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        String A = sc.nextLine();
        int n = A.length();
        int pairCount = 0;  // 쌍의 개수를 저장할 변수
        
        // 여는 괄호의 위치마다 닫는 괄호와 쌍을 이룰 수 있는 경우의 수를 센다
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                // 여는 괄호 이후에 나오는 닫는 괄호를 찾아 쌍을 형성
                for (int j = i + 1; j < n; j++) {
                    if (A.charAt(j) == ')') {
                        pairCount++;
                    }
                }
            }
        }
        
        // 결과 출력
        System.out.println(pairCount);
        
        sc.close();
    }
}
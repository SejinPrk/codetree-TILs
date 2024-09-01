import java.util.*;

public class Main {
    
    // 자릿수별로 carry 발생 여부를 확인하는 함수
    public static boolean hasCarry(int a, int b, int c) {
        while (a > 0 || b > 0 || c > 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            int digitC = c % 10;
            
            if (digitA + digitB + digitC >= 10) {
                return true; // carry 발생
            }
            
            // 다음 자리수로 넘어가기
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return false; // carry가 발생하지 않음
    }

    public static int findMaxSum(int[] numbers) {
        int n = numbers.length;
        int maxSum = -1;
        
        // 3개의 숫자를 고르는 모든 조합을 확인
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 서로 다른 3개를 선택해야 함
                    int a = numbers[i];
                    int b = numbers[j];
                    int c = numbers[k];
                    
                    if (!hasCarry(a, b, c)) { // carry가 발생하지 않는 조합
                        int sum = a + b + c;
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 줄에 숫자의 개수 입력
        int n = scanner.nextInt();
        
        // n개의 숫자 입력
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 최대 합을 구함
        int result = findMaxSum(numbers);
        
        // 결과 출력 (carry가 발생하지 않는 경우가 없으면 -1 출력)
        System.out.println(result);
        
        scanner.close();
    }
}
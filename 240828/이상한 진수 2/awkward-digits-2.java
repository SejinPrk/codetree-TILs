import java.util.Scanner;

public class Main {
    // 주어진 이진수 문자열 a에서 가능한 최대값을 찾아내는 함수
    public static int findMaxPossibleValue(String a) {
        // a가 "1"일 때는 단 하나의 비트를 바꿔서 나오는 값은 "0" 뿐이다.
        if (a.equals("1")) {
            return 0;
        }
        
        // a가 전부 1로 이루어져 있으면 가장 큰 수는 a의 첫 번째 비트를 0으로 바꾼 경우이다.
        boolean allOnes = true;
        for (char c : a.toCharArray()) {
            if (c != '1') {
                allOnes = false;
                break;
            }
        }
        
        // a가 모두 1로 이루어져 있을 경우
        if (allOnes) {
            // a의 첫 번째 자리를 0으로 바꾼 값을 반환 (ex. "1111" -> "0111")
            char[] modified = a.toCharArray();
            modified[0] = '0';
            return Integer.parseInt(String.valueOf(modified), 2);
        }
        
        int maxValue = Integer.parseInt(a, 2); // 처음에 a 자체의 10진수 값을 저장
        
        // 각 자리에 대해 하나씩 비트를 바꿔본다.
        for (int i = 0; i < a.length(); i++) {
            // 현재 비트가 0이면 1로, 1이면 0으로 바꾼다.
            char[] modified = a.toCharArray();
            modified[i] = (modified[i] == '0') ? '1' : '0';
            
            // 바꾼 이진수를 10진수로 변환
            int modifiedValue = Integer.parseInt(String.valueOf(modified), 2);
            
            // 최대값 갱신
            maxValue = Math.max(maxValue, modifiedValue);
        }
        
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 이진수 a 입력 받기
        String a = scanner.nextLine();
        
        // 가능한 N 중 최댓값 출력
        System.out.println(findMaxPossibleValue(a));
        
        scanner.close();
    }
}
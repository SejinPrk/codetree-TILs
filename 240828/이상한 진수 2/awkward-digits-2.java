import java.util.Scanner;

public class Main {
    // 주어진 이진수 문자열 a에서 가능한 최대값을 찾아내는 함수
    public static int findMaxPossibleValue(String a) {
        // a가 1일 때 단 하나의 비트를 바꿔서 나오는 값은 0 뿐
        if (a.equals("1")) {
            return 0;
        }
        
        // a가 전부 1로 이루어져 있으면 가장 큰 수는 가장 작은 비트를 0으로 바꾼 경우
        boolean allOnes = true;
        for (char c : a.toCharArray()) {
            if (c != '1') {
                allOnes = false;
                break;
            }
        }
        
        // a가 모두 1로 이루어져 있을 경우
        if (allOnes) {
            // 가장 작은 비트만 0으로 바꾼 값을 반환 (ex. "1111" -> "1110")
            char[] modified = a.toCharArray();
            modified[a.length() - 1] = '0';
            return Integer.parseInt(String.valueOf(modified), 2);
        }
        
        int maxValue = Integer.parseInt(a, 2); // 처음에 a 자체의 10진수 값을 저장
        
        // 각 자리에 대해 하나씩 비트를 바꾸기
        for (int i = 0; i < a.length(); i++) {
            // 현재 비트가 0이면 1로, 1이면 0으로 변경
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
        Scanner sc = new Scanner(System.in);
        // 이진수 a 입력 받기
        String a = sc.nextLine();

        System.out.println(findMaxPossibleValue(a));
        
        scanner.close();
    }
}
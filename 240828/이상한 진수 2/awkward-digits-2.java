import java.util.Scanner;

public class Main {
    public static int findMaxValue(String a) {  // 주어진 이진수 문자열 a에서 가능한 최대값을 찾아내는 함수
        // a가 1일 때 단 하나의 비트를 바꿔서 나오는 값은 0
        if (a.equals("1")) {
            return 0;
        }
        
        int max = Integer.parseInt(a, 2); // 처음에 a 자체의 10진수 값 저장

        // 각 자리에 대해 비트 하나씩 바꾸기
        for (int i = 0; i < a.length(); i++) {
            // 현재 비트가 0 -> 1, 1 -> 0
            char[] modified = a.toCharArray();
            modified[i] = (modified[i] == '0') ? '1' : '0';

            // 바꾼 이진수를 10진수로 변환
            int modifiedValue = Integer.parseInt(String.valueOf(modified), 2);

            max = Math.max(max, modifiedValue);
        }
        return max;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(findMaxValue(a));
        sc.close();
    }
}
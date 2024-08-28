import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        // 각 i번째 자릿수를 바꿨을 때의 십진수 값
        int ans = INT_MIN;
        for(int i = 0; i < binary.length(); i++) {
            // i번째 자릿수 변경
            char[] chars = binary.toCharArray();
            chars[i] = (chars[i] == '0') ? '1' : '0';
            String modifiedBinary = new String(chars);
            
            // 바꾼 값을 십진수로 변환
            int num = Integer.parseInt(modifiedBinary, 2);
            
            // 최댓값 갱신
            ans = Math.max(ans, num);
        }
        System.out.print(ans);
    }
}
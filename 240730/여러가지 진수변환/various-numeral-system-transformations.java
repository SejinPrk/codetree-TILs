import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        String result = convertToBase(N, B); //  N을 B진수로 변환하는 메서드
        System.out.println(result);
        
        sc.close();
    }

    public static String convertToBase(int N, int B) {
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B; // N을 B로 나눈 나머지
            sb.insert(0, remainder); // 나머지를 결과 문자열의 맨 앞에 삽입
            N /= B; // N을 B로 나눈다.
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
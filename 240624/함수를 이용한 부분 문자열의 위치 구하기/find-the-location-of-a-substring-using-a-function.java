import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String targetString = sc.nextLine();
        
        // 부분 문자열의 시작 인덱스를 찾기
        int result = findSubstring(inputString, targetString);
        
        // 결과 출력
        System.out.println(result);
    }

    public static int findSubstring(String inputString, String targetString) {
        // inputString에서 targetString의 첫 등장 위치를 반환
        return inputString.indexOf(targetString);
    }
}
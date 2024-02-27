import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        // 가장 긴 문자열과 가장 짧은 문자열 초기화
        String longest = str1;
        String shortest = str1;

        // 가장 긴 문자열 찾기
        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        // 가장 짧은 문자열 찾기
        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        // 길이 차 계산
        int lengthDifference = longest.length() - shortest.length();

        System.out.println(lengthDifference);

        scanner.close();
    }
}
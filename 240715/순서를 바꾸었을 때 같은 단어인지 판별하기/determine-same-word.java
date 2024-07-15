import java.util.Scanner;

public class Main {
    public static boolean areAnagrams(String word1, String word2) {
        // 두 단어의 길이가 다르면 애너그램이 아님
        if (word1.length() != word2.length()) {
            return false;
        }

        // 두 단어를 소문자로 변환
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // 각 단어의 문자 빈도를 저장할 배열
        int[] charCount = new int[256];

        // 첫 번째 단어의 각 문자의 빈도를 증가
        for (char c : word1.toCharArray()) {
            charCount[c]++;
        }

        // 두 번째 단어의 각 문자의 빈도를 감소
        for (char c : word2.toCharArray()) {
            charCount[c]--;
        }

        // 빈도 배열이 모두 0인지 확인
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
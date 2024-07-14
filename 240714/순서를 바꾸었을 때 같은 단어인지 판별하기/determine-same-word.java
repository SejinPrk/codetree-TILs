import java.util.Scanner;

public class Main {
    public static boolean areAnagrams(String word1, String word2) {
        // 두 단어의 길이가 다르면 애너그램이 아님
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // 문자 빈도 배열을 초기화 (알파벳 소문자 기준)
        int[] charCount = new int[26];

        // 각 문자열의 문자 빈도 계산
        for (int i = 0; i < word1.length(); i++) {
            charCount[word1.toLowerCase().charAt(i) - 'a']++;
            charCount[word2.toLowerCase().charAt(i) - 'a']--;
        }

        // 모든 빈도가 0인지 확인
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 긴 문자열 입력을 받기 위해 nextLine 사용
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        // 애너그램 판별
        if (areAnagrams(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean areAnagrams(String word1, String word2) {
        // 두 단어의 길이가 다르면 애너그램이 아님
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // 단어를 소문자로 변환한 뒤 정렬
        char[] word1Array = word1.toLowerCase().toCharArray();
        char[] word2Array = word2.toLowerCase().toCharArray();
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        // 정렬된 배열을 비교
        return Arrays.equals(word1Array, word2Array);
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
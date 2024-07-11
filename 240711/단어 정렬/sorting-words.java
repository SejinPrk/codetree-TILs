import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 개행 문자 처리
        sc.nextLine();
        
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }  
        // 단어들을 사전순으로 정렬
        Arrays.sort(words);
        
        // 정렬된 단어들 출력
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
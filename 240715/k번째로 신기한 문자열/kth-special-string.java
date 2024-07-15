import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String[] words = new String[n]; // 단어들을 저장할 배열

        for (int i = 0; i < n; i++) {
            words[i] = sc.next(); // 단어 입력 받기
        }
        
        List<String> startsWithT = new ArrayList<>();
        for (String word : words) {
            if (word.startsWith(T)) {
                startsWithT.add(word);
            }
        }
        
        // 사전순으로 정렬
        Collections.sort(startsWithT);

        // k번째 단어 출력
        if (k > 0 && k <= startsWithT.size()) {
            System.out.println(startsWithT.get(k - 1));
        }
    }
}
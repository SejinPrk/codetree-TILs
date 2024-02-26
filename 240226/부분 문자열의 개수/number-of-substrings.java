import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        int alen = A.length();
        int blen = B.length();

        for(int i = 0; i < alen; i++ ){
            if (i + blen - 1 >= alen) {
                continue;
            }
            boolean isMatched = true;
            for(int j = 0; j < blen; j++) {
                if(A.charAt(i + j) != B.charAt(j)) {
                    isMatched = false;
                }
            }
            if (isMatched) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
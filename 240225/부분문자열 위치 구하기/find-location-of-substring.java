import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tstr = sc.next();

        int len = str.length();
        int tlen = tstr.length();

        for(int i = 0; i < len; i++ ){
            if (i + tlen - 1 >= len) {
                continue;
            }
            boolean isMatched = true;
            for(int j = 0; j < tlen; j++) {
                if(str.charAt(i + j) != tstr.charAt(j)) {
                    isMatched = false;
                }
            }
            if (isMatched) {
                System.out.print(i);
                System.exit(0);
            }
        }
        System.out.print(-1);
    }
}
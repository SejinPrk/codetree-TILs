import java.util.Scanner;

public class Main {
    public static int longestSubseq(int[] seq, int t) {
        int maxLength = 0;
        int currLength = 0;

        for (int num : seq) {
            if (num > t) {
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 0;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        int result = longestSubseq(seq, t);
        
        System.out.println(result);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static int longestIncreasingSubSeq(int[] seq) {
        if (seq == null || seq.length == 0) {
            return 0;
        }
        int maxLength = 1;
        int currLength = 1;

        for (int i = 1; i< seq.length; i++) {
            if (seq[i] > seq[i - 1]) {
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 1;
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        int result = longestIncreasingSubSeq(seq);
        System.out.println(result);

        sc.close();
    }
}
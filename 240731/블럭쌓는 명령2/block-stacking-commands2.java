import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] blocks = new int[n + 1]; // 1번 칸부터 시작하므로 n + 1 크기로 생성

        for (int i = 1; i <= k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                blocks[j]++;
            }
        }

        int maxBlocks = 0; // 최대 블록 수
        
        for (int i = 1; i <= n; i++) {
            if (blocks[i] > maxBlocks) {
                maxBlocks = blocks[i];
            }
        }

        System.out.println(maxBlocks);
        sc.close();
    }
}
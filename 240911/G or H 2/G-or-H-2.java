import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] people = new int[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.next().charAt(0) == 'G' ? 1 : -1;
        }

        // 위치에 따라 정렬
        Arrays.sort(people, (a, b) -> Integer.compare(a[0], b[0]));

        int maxPhotoSize = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += people[j][1];
                if (sum == 0 || (j > i && (sum == j - i + 1 || sum == -(j - i + 1)))) {
                    maxPhotoSize = Math.max(maxPhotoSize, people[j][0] - people[i][0]);
                }
            }
        }

        System.out.println(maxPhotoSize);
    }
}
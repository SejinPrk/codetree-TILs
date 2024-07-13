import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 그룹의 수 N
        int N = sc.nextInt();
        
        // 2 * N개의 숫자
        int[] numbers = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 숫자들을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 그룹을 만들어 각 그룹의 합 중 최댓값을 찾음
        int maxGroupSum = 0;
        for (int i = 0; i < N; i++) {
            int groupSum = numbers[i] + numbers[2 * N - 1 - i];
            if (groupSum > maxGroupSum) {
                maxGroupSum = groupSum;
            }
        }
        
        // 결과 출력
        System.out.println(maxGroupSum);
        
        sc.close();
    }
}
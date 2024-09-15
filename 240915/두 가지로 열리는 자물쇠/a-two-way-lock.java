import java.util.*;

public class Main {
    static int N;
    static int[] combo1 = new int[3];
    static int[] combo2 = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < 3; i++) combo1[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) combo2[i] = sc.nextInt();

        // 각 조합에 대해 가능한 조합 계산
        Set<List<Integer>> validCombos1 = getValidCombinations(combo1);
        Set<List<Integer>> validCombos2 = getValidCombinations(combo2);
        
        // 두 조합의 결과 합치기
        validCombos1.addAll(validCombos2);
        
        System.out.println(validCombos1.size());
        sc.close();
    }

    static Set<List<Integer>> getValidCombinations(int[] combo) {
        Set<List<Integer>> validCombos = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (isValid(i, combo[0]) && isValid(j, combo[1]) && isValid(k, combo[2])) {
                        validCombos.add(Arrays.asList(i, j, k));
                    }
                }
            }
        }
        return validCombos;
    }

    static boolean isValid(int a, int b) {
        int diff = Math.abs(a - b);
        return diff <= 2 || diff >= N - 2;
    }
}
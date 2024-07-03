import java.util.Scanner;

public class Main {

    public static int findMax(int[] array) {
        return findMaxHelper(array, array.length - 1);
    }

    private static int findMaxHelper(int[] array, int n) {
        if (n == 0) {
            return array[0];
        }
        int maxInRest = findMaxHelper(array, n - 1);

        return Math.max(array[n], maxInRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

         int max = findMax(array);
        System.out.println(max);
    }
}
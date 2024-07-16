import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        List<Integer> medians = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            nums.add(num);

            if(i % 2 == 0) {
                List<Integer> currentNums = new ArrayList<>(nums);
                Collections.sort(currentNums);
                int median = currentNums.get(i / 2);
                medians.add(median);
            }
        }

        for (int median : medians) {
            System.out.print(median + " ");
        }
    }
}
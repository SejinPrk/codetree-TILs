import java.util.*;
public class Main {
    public static final int MAX_NUM = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[MAX_NUM];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        int maxProfit = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int profit = price[j] - price[i];
                
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }

        System.out.print(maxProfit);
    }
}
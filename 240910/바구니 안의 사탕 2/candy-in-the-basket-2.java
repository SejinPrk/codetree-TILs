import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        List<Basket> baskets = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int candies = sc.nextInt();
            int position = sc.nextInt();
            baskets.add(new Basket(candies, position));
        }
        
        Collections.sort(baskets, Comparator.comparingInt(b -> b.position));
        
        int maxCandies = 0;
        for (int i = 0; i < N; i++) {
            int currentCandies = 1;
            int left = baskets.get(i).position - K;
            int right = baskets.get(i).position + K;
            
            for (Basket basket : baskets) {
                if (basket.position >= left && basket.position <= right) {
                    currentCandies += basket.candies;
                }
            }
            
            maxCandies = Math.max(maxCandies, currentCandies);
        }
        
        System.out.println(maxCandies);
    }
    
    static class Basket {
        int candies;
        int position;
        
        Basket(int candies, int position) {
            this.candies = candies;
            this.position = position;
        }
    }
}
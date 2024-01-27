import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int j = 0;
        int k = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1){
                j += arr[i];
            } else {
                k += arr[i];
            }
        }
        
        if(j > k){
            System.out.println(j - k);
        } else {
            System.out.println(k - j);
        }
    }
}
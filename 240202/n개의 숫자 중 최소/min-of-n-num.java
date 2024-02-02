import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for (int i = 1; i < n; i++){
            if (min > arr[i]){ 
                min = arr[i];  
            } 
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                cnt++;
            }
        }
        System.out.println(min + " " + cnt);
    }
}
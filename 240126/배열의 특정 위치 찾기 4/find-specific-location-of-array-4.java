import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0){
                sum += arr[i];
                if(arr[i] == 0){
                    break;
                }
                cnt++;
            }
        }
        System.out.printf("%d %d\n", cnt, sum);
    }
}
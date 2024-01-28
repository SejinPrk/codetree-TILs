import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;

        for(int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 3 == 0){
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}
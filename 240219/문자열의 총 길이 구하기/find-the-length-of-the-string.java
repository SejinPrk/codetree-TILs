import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; 

        String[] arr = new String[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
            sum += arr[i].length();
        }
    
        System.out.println(sum);
    }
}
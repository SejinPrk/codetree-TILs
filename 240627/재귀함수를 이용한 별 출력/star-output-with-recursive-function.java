import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printStar(n);
    }

    // 1부터 n번째 줄까지 별을 출력하는 함수
    public static void printStar(int n) { 

        if(n == 0)                 
            return;
        
        printStar(n - 1);   // 1부터 n - 1번째 줄까지 출력하는 함수
        for(int i = 0; i < n; i++)    
            System.out.print("*");
        System.out.println();
    }
}
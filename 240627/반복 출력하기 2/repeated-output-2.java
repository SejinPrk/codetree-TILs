import java.util.Scanner;

public class Main {
    // 1부터 n번째 줄까지 문자열을 출력하는 함수
    public static void printString(int n) { 
        if(n == 0)          
            return;                       
        
        printString(n - 1);                
        System.out.println("HelloWorld");      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printString(n);
    }
}
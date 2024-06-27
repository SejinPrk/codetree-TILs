import java.util.Scanner;

public class Main {
    public static void printNumber1(int n) { 
        if(n == 0)                          
            return;                         

        printNumber1(n - 1);  
        System.out.print(n + " ");
    }

    public static void printNumber2(int n) { 
        if(n == 0)                          
            return;                         

        System.out.print(n + " ");
        printNumber2(n - 1);  
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1~7까지 출력하는 함수
        printNumber1(n);
        System.out.println();
        // 7~1까지 출력하는 함수
        printNumber2(n);
	}
}
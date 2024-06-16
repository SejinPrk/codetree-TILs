import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        int result = Calculator(a, o, c);
        
        if(result != Integer.MIN_VALUE) {
            System.out.println(a + " " + o + " " + c + " = " + result);
        } else {
            System.out.println("False");
        }
    }

    public static int Calculator(int a, int o, int c) {
        switch (o) {
            case '+':
                return add(a, c);
            case '-' : 
                return sub(a, c);
            case '*' : 
                return mul(a, c);
            case '/' :
                return div(a, c);  
            default:
                return Integer.MIN_VALUE;  
        } 
    }

    public static int add(int a, int c) {
        return a + c;
    }

    public static int sub(int a, int c) {
        return a - c;
    }

    public static int mul(int a, int c) {
        return a * c;
    }

    public static int div(int a, int c) {
        if (c == 0) {
            return Integer.MIN_VALUE; 
        }
        return a / c;
    }
}
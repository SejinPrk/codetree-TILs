import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String s = sc.next();
        int length = s.length();
        boolean exists = false;

        if (s.contains("ee")){
            exists = true;
        } if (exists == true) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        } 
        exists = false;

        if (s.contains("ab")) {
            exists = true;
        }
        if (exists == true) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        }
    }
}
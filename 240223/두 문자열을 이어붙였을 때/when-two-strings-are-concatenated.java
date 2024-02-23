import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String str1 = "";
        String str2="";

       for(int i=0;i<A.length();i++){
           str1 += A.charAt(i);
       }

       for(int i=0;i<B.length();i++){
           str2 += B.charAt(i);
       }
    

        if ((str1+str2).equals(str2+str1)) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
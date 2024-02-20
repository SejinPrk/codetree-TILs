import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];

        for(int i = 0; i<10; i++) {
            str[i] = sc.next();
        }

        for(int i = 0; i < 10; i++) {
            if (str[i]==" ") {
            str [i] = "\n";
           }
           if(i % 2 == 0){
               System.out.println(str[i]);
           }
           if (str[i] == "\0"){
            break;
           }
        }
    }
}
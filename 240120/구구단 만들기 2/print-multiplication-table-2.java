import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

            for(int i = 2; i < 10; i+=2) {
              for(int j = b; j >= a; j--) {
                    System.out.print(j + " * " + i + " = " + (i * j));
                    if(j != a)
                        System.out.print(" / ");
            }
            System.out.println();
            }
        }
    }
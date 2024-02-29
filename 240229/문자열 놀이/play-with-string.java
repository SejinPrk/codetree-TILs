import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            if(num == 1) {
                int first = sc.nextInt();
                int second = sc.nextInt();

                char ch = s.charAt(first-1);

                s = s.substring(0, first-1) + s.charAt(second-1) + s.substring(first);
                s = s.substring(0, second-1) + ch + s.substring(second);
                System.out.println(s);
            } else { 
                char charFirst = sc.next().charAt(0);
                char charSecond = sc.next().charAt(0);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == charFirst) {
                        s = s.substring(0, j) +charSecond + s.substring(j+1);
                    }
                }
                    System.out.println(s);
                }
            }
            }
        }
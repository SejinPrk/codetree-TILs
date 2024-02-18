import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result1 = str1.replaceAll("\\s", "");
        String result2 = str2.replaceAll("\\s", "");

        System.out.println(result1+result2);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryInput = sc.nextLine();

        // 이진수 -> 십진수
        int decimal = Integer.parseInt(binaryInput, 2);

        // *17
        decimal *= 17;

        // 다시 이진수로 변환
        String result = Integer.toBinaryString(decimal);
        System.out.println(result);

        sc.close();
    }
}
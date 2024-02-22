import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static double sum = 0;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Character> st = new Stack<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 == 0) {
                st.push(str.charAt(i));
            }
        }
        while (!st.empty()) {
            System.out.print(st.pop());
        }
    }
}
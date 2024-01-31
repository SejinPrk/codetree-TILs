import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[10];
        char[] sym = new char[10];
        int[] Arr = new int[4];
        
        for (int i = 0; i < 3; i++) {
            sym[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
        
            if (sym[i] == 'Y' && temp[i] >= 37){
                Arr[0]++;
            } else if (sym[i] == 'N' && temp[i] >= 37) {
                Arr[1]++;
            } else if (sym[i] == 'Y' && temp[i] < 37) {
                Arr[2]++;
            } else if (sym[i] == 'N' && temp[i] < 37) {
                Arr[3]++;
            } 
        }

         for (int i = 0; i < 4; i++) {
            System.out.print(Arr[i] + " ");
        }
            if (Arr[0] >= 2) 
                System.out.println("E");
    }
}
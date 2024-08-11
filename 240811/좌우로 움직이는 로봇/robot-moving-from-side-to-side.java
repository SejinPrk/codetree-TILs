import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000000; // 음수 인덱스 해결
    public static int[] a = new int[1000001];
    public static int[] b = new int[1000001];
    public static int aSec = 1;
    public static int bSec = 1;
    public static int ans = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t;
        char d;
        int checkSame = 0;
        
        for(int i = 0; i < n; i++) {
            t = sc.nextInt();
            d = sc.next().charAt(0);

            if (d == 'R') {
                for(int j = aSec; j < aSec + t; j++) {
                    a[j] = a[j-1] + 1; // 오른쪽으로 이동
                }
            }else if (d == 'L') {
                for(int j = aSec; j < aSec + t; j++) {
                    a[j] = a[j-1] - 1;// 왼쪽으로 이동
                }
            }
            aSec = aSec + t;
        }

        // 마지막 위치 유지
        for(int i = aSec; i < 1000001; i++) {
            a[i] = a[aSec - 1];
        }

        for(int i = 0; i < m; i++){
            t = sc.nextInt();
            d = sc.next().charAt(0);

            if (d == 'R') {
                for(int j = bSec; j < bSec + t; j++) {
                    b[j] = b[j-1] + 1;
                }
            }else if (d == 'L') {
                for(int j = bSec; j < bSec + t; j++) {
                    b[j] = b[j-1] - 1;
                }
            }
            bSec = bSec + t;
        }

        for(int i = bSec; i < 1000001; i++){
            b[i] = b[bSec - 1];
        }

        for(int i = 0; i < 1000001; i++){ 
            if (a[i] == b[i]) { // 로봇들이 같은 위치에 있을 때, 직전에 다른 위치에 있었는지 확인
                if (checkSame + 1 != i) { // 연속으로 같은 위치에 있는 경우를 제외
                    ans++;
                }
                checkSame = i;
            }
        }

        System.out.println(ans - 1); // 시작 위치(첫 만남)는 제외
    }

}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min =0;
        int max=0;
        int idx=0;

        int arr[] = new int[1000];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        min = arr[0];

        for(int i=1; i<n;i++){
            if(arr[i]<min){
                min = arr[i];
                idx = i;
            }
        }
        for(int i=idx; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        if(idx==min-1){
            System.out.print(0);
        }else{
            System.out.print(max - min);
        }
    }
}
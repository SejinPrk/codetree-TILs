import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String data = sc.next();
        String encodeData = encoding(data);
        
        System.out.println(encodeData.length());
        System.out.println(encodeData);
    }

        public static String encoding(String data){
        StringBuffer encodeData = new StringBuffer();
        int runLength = 1;
        for(int i=1; i<=data.length(); i++){
            if(i<data.length()){
                if (data.charAt(i - 1) == data.charAt(i)) {
                    runLength++;
                } else {
                    encodeData.append(data.charAt(i - 1));
                    encodeData.append(runLength);
                    runLength = 1;
                }
            }else {
                encodeData.append(data.charAt(i - 1));
                encodeData.append(runLength);
            }
        }
        return encodeData.toString();
    }
}
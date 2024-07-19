import java.util.Scanner;

class ProductSaver {
    private String product;
    private int code;

    public ProductSaver(String product, int code) {
        this.product = product;
        this.code = code;
    }

    public void printInfo() {
        System.out.println("product " + code + " is " + product);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductSaver saver1 = new ProductSaver("codetree", 50);

        String product = sc.next();
        int code = sc.nextInt();

        ProductSaver saver2 = new ProductSaver(product, code);
        
        saver1.printInfo();
        saver2.printInfo();

        sc.close();
    }
}
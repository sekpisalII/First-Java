import java.util.Scanner;

public class productDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product procuct = new Product();
        int n = scanner.nextInt();
        Product [] products = new Product[n];

        for (int i = 0 ; i < products.length ; i ++){
         products[i] = new Product();
         products[i].insert(scanner);
        }
        for (Product product: products){
            System.out.println("===============");
            product.display();
            System.out.println("===============");
        }
    }
}

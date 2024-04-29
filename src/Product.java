import java.util.Scanner;

public class Product {
    // Static variables
    static String name = "Coca";
    int iD ;
    String namE;
    double pricE ;
    public void insert(Scanner scanner){
        System.out.print("Input Id = " );
        iD = scanner.nextInt();
        System.out.print("Input Product name  = " );
        namE = scanner.next();
        System.out.print("Input Price = " );
        pricE = scanner.nextInt();
        System.out.println(name);
    }
    public void display(){
        System.out.println("product id = " + iD);
        System.out.println("product name = " + namE);
        System.out.println("product price = " + pricE);
    }


}

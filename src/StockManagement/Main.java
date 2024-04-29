package StockManagement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Getter
class Product {
            private int id;
            private String name;
            private int quantity;

            public Product(int id, String name, int quantity) {
                this.id = id;
                this.name = name;
                this.quantity = quantity;
            }

    public void setId(int id) {
                this.id = id;
            }

    public void setName(String name) {
                this.name = name;
            }

    public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
}
class StockManagement {
            private List<Product> products;

            public StockManagement() {
                products = new ArrayList<>();
            }

            public void addProduct(Product product) {
                products.add(product);
                System.out.println("Product added successfully.");
            }
            public void updateProduct(int id, int quantity) {
                for (Product product : products) {
                    if (product.getId() == id) {
                        product.setQuantity(quantity);
                        System.out.println("Product updated successfully.");
                        return;
                    }
                }
                System.out.println("Product not found.");
            }

            public void removeProduct(int id) {
                for (Product product : products) {
                    if (product.getId() == id) {
                        products.remove(product);
                        System.out.println("Product removed successfully.");
                        return;
                    }
                }
                System.out.println("Product not found.");
            }

            public void printProducts() {
                System.out.println("Product List:");
                System.out.println("ID\tName\t\t\tQuantity");
                for (Product product : products) {
                    System.out.printf("%d\t%s\t\t%d\n", product.getId(), product.getName(), product.getQuantity());
                }
            }
}
 public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                StockManagement stockManagement = new StockManagement();

                while (true) {
                    System.out.println("Stock Management Console Application");
                    System.out.println("1. Add Product");
                    System.out.println("2. Update Product");
                    System.out.println("3. Remove Product");
                    System.out.println("4. View Products");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter product ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("Enter product name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter product quantity: ");
                            int quantity = scanner.nextInt();
                            Product product = new Product(id, name, quantity);
                            stockManagement.addProduct(product);
                            break;
                        case 2:
                            System.out.print("Enter product ID: ");
                            int updateId = scanner.nextInt();
                            System.out.print("Enter new quantity: ");
                            int newQuantity = scanner.nextInt();
                            stockManagement.updateProduct(updateId, newQuantity);
                            break;
                        case 3:
                            System.out.print("Enter product ID: ");
                            int removeId = scanner.nextInt();
                            stockManagement.removeProduct(removeId);
                            break;
                        case 4:
                            stockManagement.printProducts();
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    System.out.println();
                }
            }
        }

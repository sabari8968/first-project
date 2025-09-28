package c2tc;
import java.util.Scanner;

//Entity class for Product
class Product {
 int id;
 String name;
 double price;

 // Constructor
 public Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 // Method to display product details
 public void display() {
     System.out.println("Product ID: " + id);
     System.out.println("Product Name: " + name);
     System.out.println("Product Price: " + price);
     System.out.println("-----------------------");
 }
}
public class entity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3]; // Array to store 3 products

        // Collecting product information
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(id, name, price);
        }

        // Display all products
        System.out.println("\n--- All Product Details ---");
        for (Product p : products) {
            p.display();
        }

        sc.close();
	}
}
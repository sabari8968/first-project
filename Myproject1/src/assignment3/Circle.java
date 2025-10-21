package assignment3;
import java.util.Scanner;

// Class: Circle
public class Circle {
    // Data members
    double radius;
    String colour;

    // Method (i): getInput() — accepts the details of the circle
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter the colour of the circle: ");
        colour = sc.nextLine();
    }

    // Method (ii): calcArea() — calculates and displays the area
    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area of the circle: " + area);
    }

    // Main method
    public static void main(String[] args) {
        Circle c1 = new Circle();   // create object
        c1.getInput();              // take user input
        c1.calcArea();              // calculate & display area
    }
}
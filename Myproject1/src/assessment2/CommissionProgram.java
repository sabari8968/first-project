package assessment2;
import java.util.Scanner;

// Class 1: Student with default constructor
class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

// Class 2: Commission
class Commission {
    // Data members
    String name;
    String address;
    String phone;
    double salesAmount;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;
        else
            commission = 0;

        System.out.println("\nCommission Details:");
        System.out.println("Name: " + name);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}

// Main Class
public class CommissionProgram {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Create Commission object
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}


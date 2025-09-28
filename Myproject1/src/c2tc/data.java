package c2tc;
import java.util.Scanner;

//Entity class for Student
class Student {
 int id;
 String name;
 int age;

 // Constructor
 public Student(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 // Method to display student details
 public void display() {
     System.out.println("Student ID: " + id);
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
     System.out.println("-----------------------");
 }
}
public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3]; // Array to store 3 students

        // Collecting student information
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            students[i] = new Student(id, name, age);
        }

        // Display all student details
        System.out.println("\n--- All Student Details ---");
        for (Student s : students) {
            s.display();
        }
        sc.close();
	}
}
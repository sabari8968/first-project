package com.sabarinathan.assignment;
import com.sabarinathan.assignment.Employees.*;
import com.sabarinathan.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {

    public static void main(String[] args) {

        // Creating Manager object
        Manager manager = new Manager("Ravi Kumar", 101, 75000, "IT Department");

        // Creating Developer object
        Developer developer = new Developer("Sneha Patel", 102, 60000, "Java");

        // Using utility class to display information
        EmployeeUtilities.displayEmployeeDetails(manager);
        EmployeeUtilities.displayEmployeeDetails(developer);
    }
}  
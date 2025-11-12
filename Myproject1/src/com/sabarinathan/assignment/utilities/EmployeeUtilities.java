package com.sabarinathan.assignment.utilities;

import com.sabarinathan.assignment.Employees.Employee;

public class EmployeeUtilities {
	    public static double calculateYearlySalary(Employee emp) {
	        // Accessing public methods (getters)
	        return emp.getSalary() * 12;
	    }
	    public static void displayEmployeeDetails(Employee emp) {
	        System.out.println("----- Employee Details -----");
	        emp.displayInfo();
	        System.out.println("Yearly Salary: " + calculateYearlySalary(emp));
	        System.out.println("-----------------------------\n");
	    }
	}

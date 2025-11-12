package com.sabarinathan.assignment.Employees;

public class Employee {
	// Private fields
	    private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Default constructor
	     */
	    public Employee() {
	    }

	    /**
	     * Parameterized constructor
	     * @param name Name of the employee
	     * @param employeeId Unique ID of the employee
	     * @param salary Salary of the employee
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    /** @return Employee name */
	    public String getName() {
	        return name;
	    }

	    /** @param name Sets the employee name */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /** @return Employee ID */
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    /** @param employeeId Sets the employee ID */
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    /** @return Employee salary */
	    public double getSalary() {
	        return salary;
	    }

	    /** @param salary Sets the employee salary */
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    /**
	     * Displays employee details
	     */
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
	    }
	}

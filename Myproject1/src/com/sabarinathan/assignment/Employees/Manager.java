package com.sabarinathan.assignment.Employees;
 public class Manager extends Employee {

	    private String department;

	    /**
	     * Default constructor
	     */
	    public Manager() {
	    }

	    /**
	     * Parameterized constructor
	     * @param name Name of the manager
	     * @param employeeId ID of the manager
	     * @param salary Salary of the manager
	     * @param department Department managed by the manager
	     */
	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    /** @return Department name */
	    public String getDepartment() {
	        return department;
	    }

	    /** @param department Sets department name */
	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Department: " + department);
	    }
	}
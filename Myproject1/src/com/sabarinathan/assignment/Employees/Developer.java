package com.sabarinathan.assignment.Employees;

public class Developer extends Employee {

	    private String programmingLanguage;

	    /**
	     * Default constructor
	     */
	    public Developer() {
	    }

	    /**
	     * Parameterized constructor
	     * @param name Name of the developer
	     * @param employeeId Developer ID
	     * @param salary Salary of the developer
	     * @param programmingLanguage Programming language expertise
	     */
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	    /** @return Programming language */
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    /** @param programmingLanguage Sets programming language */
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
	}
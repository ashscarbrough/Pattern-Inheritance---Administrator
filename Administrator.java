import java.util.Scanner;

/*
Name: Ash Scarbrough
Assignment: Homework 2 - Part 3
Class: CSCI-C490 Mobile Application Development
Semester: Summer Session 1, 2016
Date: 5/23/2016
*/

public class Administrator {

	private String name;
	private Date start;
	private int salary;
	private String title;
	private String area;
	private String supervisorsName;
	
	/* * * * * * * * * * * * * * * * * * * * * 
	 *  Constructors for Administrator Class *
	 * * * * * * * * * * * * * * * * * * * * */
	
	// Default Constructor
	public Administrator () {
		name = "No Name";
		start = new Date();
		salary = 0;
		title = "None";
		area = "None";
		supervisorsName = "None";
	}
	
	// Constructor with parameters for each variable in Administrator Class
	public Administrator (String name, Date start, int salary, String title, String area, String supervisorsName) {
		this.name = name;
		this.start = start;
		this.salary = salary;
		this.title = title;
		this.area = area;
		this.supervisorsName = supervisorsName;
	}
	
	// Deep Copy Constructor for Administrator Class
	public Administrator (Administrator admin) {
		this.name = admin.name;
		this.start = new Date (admin.start.getMonth(), admin.start.getDay(), admin.start.getYear());
		this.salary = admin.salary;
		this.title = admin.title;
		this.area = admin.area;
		this.supervisorsName = admin.supervisorsName;
	}
	
	/* * * * * * * * * *
	 *  Class Methods  *
	 * * * * * * * * * */

// Set Methods
	
// Get Methods
	// Accessor function to obtain Administrator's name
	public String getName() {
		return name;
	}
	
	// Accessor function to obtain hire Start Date
	public Date getStart() {
		return start;
	}
	
	// Accessor function to obtain salary
	public int getSalary() {
		return salary;
	}
	
	// Accessor function to obtain Administrator's job title
	public String getTitle() {
		return title;
	}
	
	// Accessor function to obtain Administrator's employment area
	public String getArea() {
		return area;
	}
	
	// Accessor function to get supervisor's name
	public String getSupervisorsName() {
		return supervisorsName;
	}
	
				// Set Methods//
	
	// Mutator function to change Administrator's name
	public void setName(String name) {
		this.name = name;
	}

	// Mutator function to alter the Administrators hire date
	public void setDate () {
		int month, day, year;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input year in format \"19XX\": ");
		year = keyboard.nextInt();
		
		System.out.print("Input month number: ");
		month = keyboard.nextInt();
		
		System.out.print("Input day of month: ");
		day = keyboard.nextInt();
		
		start.setDate(month, day, year);
	}

	// Mutator function to change Administrator salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Mutator function to alter Administrator job Title
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	// Mutator function to set Administrator employment area
	public void setArea(String area) {
		this.area = area;
	}
	
	// Mutator function to change supervisor's name
	public void setSupervisorsName(String supervisorsName) {
		this.supervisorsName = supervisorsName;
	}
	
			// Other Methods//
	// Method compares two Administrator instances to test equality
    public boolean equals(Administrator other)
    {
        return ((this.name == other.name) && (this.start.equals(other.start)) 
        		&& (this.salary == other.salary) && (this.title == other.title) 
        			&& (this.area == other.area) && (this.supervisorsName == other.supervisorsName));
    }
    
    // Mutator Method takes user input to alter each value for class Administrator.
    public void readAdminInfo(){
    	Scanner keyboard2 = new Scanner(System.in);
    	
    	String newName, newTitle, newArea, newSupervisorsName;
    	int newSalary;
    	
    	System.out.print("Give new Administrator Name: ");
    	newName = keyboard2.nextLine();
    	this.setName(newName);
    	
    	this.setDate();
    	System.out.println(start);
		
    	System.out.print("Give new Administrator salary: ");
    	newSalary = keyboard2.nextInt();
    	this.setSalary(newSalary);
    	
    	System.out.print("Give new job Title: ");
    	newTitle = keyboard2.nextLine();
    	newTitle = keyboard2.nextLine();
    	this.setTitle(newTitle);
    	
    	System.out.print("Give new Administrator job area: ");
    	newArea = keyboard2.nextLine();
    	this.setArea(newArea);
    	
    	System.out.print("Give new Supervisor name: ");
		newSupervisorsName = keyboard2.nextLine();
		this.setSupervisorsName(newSupervisorsName);
    	
		keyboard2.close();
    }
    
	// ToString Method which outputs administrator data to a string
	public String toString() {
		String adminString;
		adminString = "\nAdministrator Name: \t" + name + "\nHire Date:\t\t" + start 
				+ "\nSalary:\t\t\t" + salary + "\nJob Title:\t\t" + title + "\nEmployment Area:\t" + area 
					+ "\nSupervisor Name:\t" + supervisorsName + "\n";
		return adminString;
	}
	
}

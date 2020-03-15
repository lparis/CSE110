package week7;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: MovieSeating.java
//SPECIFICATION: Arrays and Classes
//FOR: CSE 110 - Assignment 7 (Assignment7.java, Customer.java)
//TIME SPENT: 24 hours (at least)
//DATE: 6/27/2019
//----------------------------------------------------------------------*/ 


public class MovieSeating {
	
	// Instance variables
	private Customer seating[][];
	private int row;
	private int column;
	
	// Class Constructor for MovieSeating
	// Creates new 2D array object named seating
	// Instantiates a two dimensional array of the size rowNum by columnNum 
	// specified by the parameters. 
	// Then it initializes each customer element of this array using the 
	// constructor of the class Customer without any parameter. 
	// So each customer will have default values for its instance variables.
	public MovieSeating(int rowNum, int columnNum)
	{
		seating = new Customer[rowNum][columnNum];
		
		for (int row = 0; row < seating.length; row++)
		{
			for (int col = 0; col < seating[row].length; col++)
			{
				seating[row][col] = new Customer();
			}
		}
	}
	
	// getCustomerAt()
	// Returns customer at the indexes row and col (specified by the parameters of this method) 
	// of the array seating.
	private Customer getCustomerAt(int row, int col)
	{
		return seating[row][col];
	}
	
	// Assigns seat to customer if one is available
	// The method attempts to assign tempCustomer to the seat at row and col 
	// (specified by the parameters of this method). If the seat has a default customer, 
	// i.e., a customer with the last name "???" and the first name "???", 
	// then we can assign the new customer tempCustomer to that seat and the method returns true. 
	// Otherwise, this seat is considered to be taken by someone else, 
	// the method does not assign the customer and returns false.
	// Can use cust.getLastName and getFirstName .equals
	public boolean assignCustomerAt(int row, int col, Customer tempCustomer)
	{
		Customer custm = seating[row][col];
		if (custm.getLastName().equals("???") && custm.getFirstName().equals("???"))
		{
			seating[row][col] = tempCustomer;
			return true;
		}
		else
			return false;
	}
	
	// Checks if the parameters row and col are valid.
	// The method checks if the parameters row and col are valid. 
	// If at least one of the parameters row or col is less than 0 
	// or larger than the last index of the array 
	// (note that the size of rows and columns can be different), 
	// then it returns false. Otherwise it returns true.
	public boolean checkBoundaries(int row, int col)
	{
		if (row < 0 || col < 0 || row >= seating.length || col >= seating[0].length)
		{
			return false;
		}
		else
			return true;
	}
	
	// Returns a String containing information of the seating. 
	// It should show the list of customers assigned to the seating using 
	// the toString method of the class Customer (show only the initials of each customer) 
	public String toString()
	{
		String seats = "The Current Seating\n";
		seats+= "-------------------\n";
		
		for (int row = 0; row < seating.length; row++)
		{
			for (int col = 0; col < seating.length; col++)
				// For some reason if I put brackets around the following statements
				// it messes up the seating table 
				// Need to investigate this further
				seats += seating[row][col].getFirstName().charAt(0) + "." + seating[row][col].getLastName().charAt(0) + "." + " ";
				seats += "\n";
		}
		return seats;
	}
}

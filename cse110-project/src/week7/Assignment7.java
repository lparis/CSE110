package week7;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: MovieSeating.java
//SPECIFICATION: Arrays and Classes
//FOR: CSE 110 - Assignment 7 (Assignment7.java, Customer.java)
//TIME SPENT: 24 hours
//DATE: 6/27/2019
//----------------------------------------------------------------------*/ 

// This source file has an error in it. Also, the formatting is off.
// Basically had to rewrite it for my env.

import java.io.*;

public class Assignment7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Instance variables
		// MovieSeating object
		MovieSeating theatreSeating;
		// Customer object
		Customer tempCustomer;
		int row, col, rowNum, columnNum;
		String line, fileName;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(isr);
		
		// Get number of rows
		System.out.println("Please enter a number of rows for a movie theatre seating.");
		rowNum = Integer.parseInt(stdin.readLine());
		
		// Get number of columns
		System.out.println("Please enter a number of columns for a movie theatre seating.");
		columnNum = Integer.parseInt(stdin.readLine());
		
		// Instantiate MovieSeating object
		theatreSeating = new MovieSeating(rowNum, columnNum);
		
		// Get file name read from a KEYBOARD.
		// /Users/lparis/documents/workspace/eclipse/CSE110/cse110-project/src/week7/customerData.txt
		System.out.println("Please enter a file name");
		fileName = stdin.readLine();
		
		// Create FileReader and BufferedReader object to
	    // read from a file.
		FileReader fr = new FileReader (fileName);
		BufferedReader inFile = new BufferedReader (fr);
		
		// Read customer information from a FILE
	    line = inFile.readLine();
	    
	    // Read line by line until the end of the file
	    while (line != null)
	    {
	    	System.out.println("\nA customer information is read from a file.");
	    	
	    	// printing information read from a file.
	    	System.out.println(line);

	    	// creating a customer object using information from a file
	    	tempCustomer = new Customer(line);
	    	
	    	// Ask a user to decide where to seat a customer by asking for row and column of a seat
	    	System.out.println("Please enter a row number where the customer wants to sit.");
	    	row = Integer.parseInt(stdin.readLine());
	    	
	    	System.out.println("Please enter a column number where the customer wants to set.");
	    	col =  Integer.parseInt(stdin.readLine());
	    	
	    		if (theatreSeating.checkBoundaries(row, col) == false)
	    		{
	    			System.out.println("\nrow or column number is not valid.");
	    			System.out.println("A customer " + tempCustomer.getFirstName() + " " + tempCustomer.getLastName() + " is not assigned a seat.");
	    		}
	    	
	    		else
	    		{
	    			// Assigning seat for customer
	    			if (theatreSeating.assignCustomerAt(row, col, tempCustomer) == true)
	    			{
	    				System.out.println("\nThe seat at row " + row + " and column " + col + " is assigned to the customer " + tempCustomer.toString());
	    				System.out.println(theatreSeating);
	    			}
	    			else
	    			{
	    			System.out.println("\nThe seat is taken.");
	    			}
	    		} // close else
	    	
	    		// Read next line in file
	    		line = inFile.readLine();
	    	}
	    
	    // Close the file
	    inFile.close();
	}// Close main()
}// Close class

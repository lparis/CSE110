package week5;

/*-------------------------------------------------------------------------
// AUTHOR: Lorenzo Paris 
// FILENAME: Assignment5.java
// SPECIFICATION: Answers questions and keeps a tally
// FOR: CSE 110 - Assignment 5
// TIME SPENT: 60 minutes
// DATE: 6/23/2019
//----------------------------------------------------------------------*/ 

import java.util.*;

public class Assignment5 {

	public static void main (String[] args) {

		Scanner console = new Scanner (System.in);

		String choice;
		char command;

		// print the menu
		printMenu();
		
		// create new Geek object
		Geek myGeek = new Geek("Geek", 0);

		do
		{
			// ask a user to choose a command
			System.out.println("\nPlease enter a command or type ?");
			choice = console.next().toLowerCase();
			command = choice.charAt(0);

			switch (command)
			{
				case 'a':
					// Prints name of Geek
					System.out.println("Name: " + myGeek.getName());
					break;
				
				case 'b': 
					// Prints number of questions
					System.out.println("Number of questions: " + myGeek.getNumberOfQuestions());
					break;
				
				case 'c':
					// Asks for two integers and finds and prints if their sum is even or odd
					Scanner in = new Scanner(System.in);
			 		System.out.println("Enter a number: ");
					int int1 = in.nextInt();						 			
					System.out.println("Enter the second number: ");			
					int int2 = in.nextInt();
					boolean result = myGeek.isEven(int1, int2);
					if (result)
						System.out.println("The sum is even");
					else
						System.out.println("The sum is odd");
					break;
				
				case 'd':
					// Asks for two integers and finds and prints the sum of all integers between them (inclusive)
					Scanner in2 = new Scanner(System.in);
			 		System.out.println("Enter a number: ");
					int int3 = in2.nextInt();						 			
					System.out.println("Enter a second number: ");			
					int int4 = in2.nextInt();
					System.out.println("The sum between " + int3 + " and " + int4 + " is " + myGeek.sum(int3, int4));					
					break;
					
				case 'e':
					// Asks for a year and finds out and prints if is leap year or not
			        Scanner in3 = new Scanner(System.in);
			 		System.out.println("Enter a year: ");
					int year = in3.nextInt();
					boolean leap = myGeek.leapYear(year);
					if (leap)
						System.out.println(year + " is a leap year");
					else
						System.out.println(year + " is not a leap year");
					break;
					
				case '?':
					printMenu();
					break;
				
				case 'q':
					break;

				default:
					System.out.println("Invalid input");

			}

		} while (command != 'q');
		
	    console.close();

	}  //end of the main method

	public static void printMenu()
	{
		System.out.print("\nCommand Options\n"
			+ "-----------------------------------\n"
			+ "a: get name\n"
			+ "b: number of questions asked\n"
			+ "c: sum is even\n"
			+ "d: sum between two integers\n"
			+ "e: leap year\n"
			+ "?: display the menu again\n"
			+ "q: quit this program\n\n");

	} // end of the printMenu method
	
}  // end Assignment5 class
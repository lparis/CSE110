package week5;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Geek.java
//SPECIFICATION: Geek class has public methods to answer questions
//FOR: CSE 110 - Assignment 5
//TIME SPENT: 60 minutes
//DATE: 6/23/2019
//----------------------------------------------------------------------*/ 

public class Geek {
	
	// Class Attributes or Instance Variables
	private static String name = "?";
	private static int numQuestions = 0;
	
	// Object Constructor
	// Set the Geek’s name and the number of questions asked.
	public Geek(String name, int numQuestions) {
		this.name = name;
		this.numQuestions = numQuestions;
	}
	
	// Accessor Method: Takes no params; returns the Geek’s name as a String.
	public String getName() {
		return name;
	}
	
	// Accessor Method: Takes no params; returns how many questions have been asked.
	public int getNumberOfQuestions() {
		return numQuestions;
	}
	
	// Method takes two ints; returns boolean indicating if the sum of the numbers is even or not.
	public boolean isEven(int num1, int num2) {
		numQuestions++;
		boolean result;
		if ((num1 + num2) % 2 == 0)
			result = true;
		else
			result = false;
		return result;
	}

	// Method takes two ints; returns sum of all numbers between the two (inclusive).
	public int sum(int num1, int num2) 
	{
		numQuestions++;
		int sum = 0;
		if (num1 <= num2)
			for (int i = num1; i <= num2; i++)
				sum = sum + i;
		else if (num2 <= num1)
			for (int i = num2; i <= num1; i++)
				sum = sum + i;
		return sum;		

	}
	
	// Method takes an int (year) and returns a bool indicating if it is a leap year.
	 public boolean leapYear(int year) 
	 {
		numQuestions++;
		boolean leap = false;
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
					leap = true; 	// If divisible by 100 and 400, yes leap year
				else
					leap = false;	// If divisible by 100 and not 400, no leap year
			}
			else
				leap = true;		// If divisible by 4 and not by 100, yes leap year
		}
		else
			leap = false; 			// If not divisible by 4, no leap year
		return leap; 
	 }
}

package week6;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Lab7.java
//SPECIFICATION: Arrays
//FOR: CSE 110 - Lab 7
//TIME SPENT: 60 minutes
//DATE: 6/25/2019
//----------------------------------------------------------------------*/ 

import java.util.Scanner;


public class Lab7 {
	
	public static void main(String[] args) {
	
		// Create a Scanner object for later use
		Scanner scan = new Scanner(System.in);
		
		// Constant int of size 5
		final int SIZE = 5;
		
		// Delcare and array of ints with SIZE 5
		int[] myArray = new int[SIZE];
	
		// Populate the the array with input
		System.out.println("Enter 5 numbers...");
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = scan.nextInt();
		}
		
		// Print the array
		System.out.println("Processing each array element...");
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i] + 1);
		}
		
		scan.close();
	}
}

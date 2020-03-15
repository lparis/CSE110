package week3;

import java.util.Scanner;

//***********************************************************
//Name: Lorenzo Paris
//Title: Lab4.java
//Author: Lorenzo Paris
//Description: Loops
//FOR: CSE110 Lab 4
//Time spent: 90 minutes
//Date: 6/9/2019
//**************************************************************
public class Lab4 {

	public static void main(String[] args) {
		
		// Set up the scanner
        Scanner in = new Scanner(System.in);

        // Declare and initialize variables
        int largest_int;
        int smallest_int;
        int counter = 0;
        int even_int = 0;
        int odd_int = 0;
        double sum = 0;
        int input;
        double avg;
        
        System.out.println("Enter a series of integers (zero to quit):");
        input = in.nextInt();
        largest_int = input;
        smallest_int = input;
        
        while (input != 0)
        {
        	if (input > largest_int)
        		largest_int = input;
        	if (input < smallest_int)
        		smallest_int = input;
        	if (input % 2 == 0)
        		even_int++;
        	else
        		odd_int++;
        	sum = sum + input;
        	counter++;
            
//        	System.out.println("Enter an integer, or enter 0 to quit.");
            input = in.nextInt();
        }
        
        System.out.println("The smallest integer is " + smallest_int);
        System.out.println("The largest integer is " + largest_int);
        System.out.println("Total number of integers entered is " + counter);
        System.out.println("Total even numbers entered is " + even_int);
        System.out.println("Total odd numbers entered is " + odd_int);
        avg = sum / counter;
        System.out.println("The average value is " + avg);
        
        // Close the input scanner
        in.close();
        
	}
}
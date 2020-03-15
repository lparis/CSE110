package week1;

/*
 * Name: Lorenzo Paris
 * Title: Lab2.java
 * Description: Prints out my first program and my name.
 * Time spent: 15 minutes
 * Date: 5/19/2019
 */

import java.util.Scanner;

public class Lab2
{
     public static void main (String[] args)
     {
    	 //variables
	     int test1, test2, test3;
	     //constant
	     final int NUM_TESTS = 3;
	          
	     Scanner in = new Scanner(System.in);
	          
	     System.out.print("Enter the score on the first test: ");
	     test1 = in.nextInt();
	     System.out.print("Enter the score on the second test: ");
	     test2 = in.nextInt();
	     System.out.print("Enter the score on the third test: ");
	     test3 = in.nextInt();	          

	     // compute average
	     float average = (test1 + test2 + test3) / NUM_TESTS;	          
	                  		              
	     System.out.println ("Your average test score is " + average);
	          
	     in.close();
	}
}

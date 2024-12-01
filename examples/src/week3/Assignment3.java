package week3;
//***********************************************************
// Name: Lorenzo Paris
// Title: Assignment3.java
// Author: Lorenzo Paris
// Description: Computes Greatest Common Denominator
// Time spent: 60 minutes
// Date: 6/9/2019
//**************************************************************

/* PART I.1 Answers
 * a) 10 9 8 7 6 5 4 3 2 
 * b) 5 15 
 */

// PART I.2 Answer
/*
 * 		System.out.println("Enter a string: ");

        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.print("Reversed string is " + rev);
 */


import java.util.Scanner;

public class Assignment3
{
     public static void main (String[] args)
     {
 		System.out.println("This program computes the GCD of 2 positive integers.");
 		
 		Scanner in = new Scanner(System.in);
 		int num1 = 0, num2 = 0, gcd = 0;
 		
 		System.out.println("Enter the first integer: ");
		int int1 = in.nextInt();
		num1 = int1;
			 			
		System.out.println("Enter the second integer: ");			
		int int2 = in.nextInt();
		num2 = int2;
		
		do
		{
			if (int1 > int2)
			{
 				int1 = int1 - int2;
				gcd = int1;
			}
 			else
 			{
 				int2 = int2 - int1;
 				gcd = int2;
 			}
		}
		while (int1 != int2);
		
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);

        in.close();
     }
}
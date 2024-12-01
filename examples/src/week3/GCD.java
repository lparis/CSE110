package week3;

import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		// Intro message
		System.out.println("This program will find the GCD of 2 positive integers.");
		
		Scanner scan = new Scanner(System.in);
		
		String again;
		
		do{
			
			
			// read input
			System.out.print("\nEnter the first positive integer: ");
			int num1 = scan.nextInt();
			
			boolean valid = true;
			// check if first input is positive
			while (num1 <= 0)
			{
				System.out.print("The number must be positive. please re-enter: ");
				num1 = scan.nextInt();
				valid = false;
			}
			
			if (!valid)
				System.out.println();
			
			System.out.print("\nEnter the second positive integer: ");
			
			int num2 = scan.nextInt();
			
			// check if second input is positive
			while (num2 <= 0)
			{
				System.out.print("The number must be positive. please re-enter: ");
				num2 = scan.nextInt();
			}
			
			//test output. To be removed
			//System.out.println("\nnum1 = " + num1 + ", num2 = " + num2);
			
			//calculate gcd
			
			//show the first step in chain before the loop
			System.out.print("\ngcd(" + num1 + ", " + num2 + ")");
			
			//length of chain starts at 1
			int length = 1;
			
			//loop calculate the gcd
			//while the 2 nums are not equal
			//if num1 > num2, then gcd(num1,num2) = gcd (num1-num2, num2) and 
			//if num1 < num2, then gcd(num1,num2) = gcd (num1, num2-num1) and
			
			while (num1 != num2)
			{
				if (num1> num2)
					num1 = num1 - num2;
				else
					num2 = num2 - num1;
				
				//print out next part of chain
				System.out.print(" = gcd(" + num1 + ", " + num2 + ")");
				length++;
			}
			
			
			//display final output
			System.out.println(" = " + num1);
			System.out.println("\nIt took " + length + " steps to calculate the GCD");
			
			//ask if they want to go again
			System.out.print("Would you like to find another gcd (y/n)? ");
			again = scan.next();
			
		}while(again.equalsIgnoreCase("y"));
		
		System.out.println("\nThank you for using the program.");
		
		scan.close();
	}
	

}

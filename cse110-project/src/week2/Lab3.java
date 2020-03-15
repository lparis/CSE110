package week2;

import java.util.Scanner;

//***********************************************************
//Name: Lorenzo Paris
//Title: Lab3.java
//Author: Lorenzo Paris
//Description: Compare Strings
//FOR: CSE110 Lab 3
//Time spent: 30 minutes
//Date: 6/1/2019
//**************************************************************
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hardcoded string values to test Part 1 with
		// String s1 = "hello", s2 = "hello";
		
		// String variables
		String s1, s2;

        // Class to get input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        s1 = in.nextLine();
        System.out.print("Enter String 2: ");
        s2 = in.nextLine();
        
        // Compare the strings using the String.compareTo() method
        // Method returns an int, 0 if the strings are the same
        // Case sensitive
		int compare = s1.compareTo(s2);
		System.out.println();
		System.out.println("String compareTo -- case sensitive");
		if (compare == 0)
			System.out.println("The strings \"" + s1 + "\" and \"" + s2 + "\" are the same.");
		else
			System.out.println("The strings \"" + s1 + "\" and \"" + s2 + "\" are not the same.");
		
        // Compare the strings using the String.equals() method
		// Boolean operation; returns true or false
		// Case insensitive
		Boolean equal = s1.equalsIgnoreCase(s2);
		System.out.println();		
		System.out.println("String equals -- case insensitive");		
		if (equal == true)
			System.out.println("The strings \"" + s1 + "\" and \"" + s2 + "\" are the same.");
		else
			System.out.println("The strings \"" + s1 + "\" and \"" + s2 + "\" are not the same.");

		System.out.println();		
		System.out.println("-- String length comparison result --");		
		if (s1.length() > s2.length())		
			System.out.println("String 1 \"" + s1 + "\" is longer than String 2 \"" + s2 + "\".");
		else if (s1.length() < s2.length())
			System.out.println("String 2 \"" + s2 + "\" is longer than String 1 \"" + s1 + "\".");
		else
			System.out.println("The strings are the same length.");
		
		in.close();
	}

}

package week7;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Arrays.java
//SPECIFICATION: Creates Array Class and Methods
//FOR: CSE 110 - Arrays Class for Lab 8 
//TIME SPENT: 60 minutes
//DATE: 6/27/2019
//----------------------------------------------------------------------*/ 

import java.util.Random;

public class Arrays {
	
	// Instance variables
	private int count;
	private int[] array;
	
	
	// Constructors
	public Arrays(int size)
	{
		array = new int[size];
		count = size;
		
		Random rand = new Random();
	     for (int i = 0; i < count; i++) {
	          array[i] = (rand.nextInt(10));
	     }
	}
	
	public Arrays(int[] arr)
	{
		array = arr;
		count = array.length;
	}
	
	// findMin()
	public int findMin() 
	{
		int min = array[0]; // Set min to the first element
		for (int i = 1; i < count; i++) {
	    // Reassign min if there is a smaller element
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min; // Return the smallest element
	}
	
	// findMax()
	public int findMax() 
	{
		int max = array[0]; // Set max to the first element
		for (int i = 1; i < count; i++) {
	    // Reassign max if there is a smaller element
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max; // Return the largest element
	}
	
	// calcSum()
	private int calcSum()
	{
		int sum = 0;
		for (int i = 0; i < count; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}
	
	// calcAverage()
	public double calcAverage()
	{
		return count;
		
	}
	
	// toString
	public String toString() {
	     String output = "[ ";
	     for (int i = 0; i < count; i++) {
	          output += array[i];
	          if (i != count - 1) {
	               output += ", ";
	          }
	}
	     return output + " ]";
	}
}

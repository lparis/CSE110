package week6;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: NumberCollection.java
//SPECIFICATION: Creates array object and provides methods for operating
 * on array objects
//FOR: CSE 110 - Assignment 6
//TIME SPENT: 60 minutes
//DATE: 6/26/2019
//import java.text.DecimalFormat;
//----------------------------------------------------------------------*/ 

//import java.util.Arrays;
//import java.text.DecimalFormat; 

public class NumberCollection 
{
	// Instance variables
	private int count;
	// Declare array variable `numberArray` of type int
	private int[] numberArray;
	// C++ style declaration
	// private int numberArray2[];

	// Constructor creates empty NumberCollection object with array capacity specified by the integer parameter arraySize.
	public NumberCollection(int arraySize)
	{
		setCount(0);
		// Create the numbrerArray array using the arraySize instance variable
		numberArray = new int[arraySize];
	}
	
	// Helper method that returns the index of the number specified by the parameter is located. 
	// If the number is not found, it returns -1. 
	// Searches the array for the value specified
	// Linear search
			
	private int indexOf(int searchingNum) 
	{
		int index = -1;
		for (int i = 0; i < numberArray.length; ++i)
		{
			if (searchingNum == numberArray[i])
			{
				index = i;
				System.out.println(numberArray[i] + "contains ");
			}
		}
//		if (index != -1)
//			System.out.println("Number already exists at index " + index);
//		else
//			System.out.println("Number does not exist " + index);
		return index;
	}

	// The method will add numberToAdd at the smallest available index in the array, if the number is not in already in the array. 
	// Be sure to check if the number is already in the array using indexOf
	public boolean addNumber(int numberToAdd)
	{
		if (indexOf(numberToAdd) != -1)
		{
			for (int index = 1; index < numberArray.length; index++)
			{
				int key = numberArray[index];
				int position = index;
				while (position > 0 && numberArray[position - 1] > key)
				{
					numberArray[position] = numberArray[position - 1];
					position--;
				}
			}		
		}
		return true;
	}
	// Method finds and returns the maximum value among the numbers stored in the array. 
	// If the array is empty, return 0.
	public int findMax() 
	{
		int max = 0, temp;
		for (int index = 0; index < numberArray.length - 1; index++) 
		{
			max = index;
			for (int scan = index + 1; scan < numberArray.length; scan++)
			{
				if (numberArray[scan] > numberArray[max])
					max = scan;
			}
			temp = numberArray[max];
			numberArray[max] = numberArray[index];
			numberArray[index] = temp;
		}
		return max;
	}
	
	// Method finds and returns the minimum value among the numbers stored in the array. 
	// If the array is empty, return 0.
	public int findMin() 
	{
		int min = 0, temp;
		for (int index = 0; index < numberArray.length - 1; index++) 
		{
			min = index;
			for (int scan = index + 1; scan < numberArray.length; scan++)
			{
				if (numberArray[scan] < numberArray[min])
					min = scan;
			}
			temp = numberArray[min];
			numberArray[min] = numberArray[index];
			numberArray[index] = temp;
		}
		return min;
	}
	
	// Method returns the sum of numbers stored in numberArray so far. 
	// If the array is empty, return 0.
	public int computeSum()
	{
		int sum = 0;
		for (int index = 0; index < numberArray.length - 1; index++) 
		{
			sum = sum + numberArray[index];
		}
		return sum;
	}
		
	// Returns the array numberArray as a string 
	// With the format as follows: {3, 6, -1, 3, 23, -50, 43}
	public String toString()
    {
		String numberArrayString = "";
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArrayString = numberArrayString + Integer.toString(numberArray[i]);
		}
		return numberArrayString;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

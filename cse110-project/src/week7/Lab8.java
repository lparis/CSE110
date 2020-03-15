package week7;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Lab8.java
//SPECIFICATION: Creates Array objects
//FOR: CSE 110 - Lab 8 
//TIME SPENT: 60 minutes
//DATE: 6/27/2019
//----------------------------------------------------------------------*/ 


public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an Arrays object using the first constructor
		Arrays arr1 = new Arrays(5);
		
		// Print the contents of the array in arr1
		System.out.println(arr1);
		
		// Call findMin, findMax, and calcAverage on arr1 and print their values
		System.out.println("Min: " + arr1.findMin());
		System.out.println("Max: " + arr1.findMax());
		System.out.println("Average: " + arr1.calcAverage());
		System.out.println();
		
		int[] someArray = {3, 7, 11};
		Arrays arr2 = new Arrays(someArray);
		System.out.println(arr2.toString());
	}

}

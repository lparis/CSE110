//***********************************************************
// Name: Lorenzo Paris
// Title: Triangle.java
// Author: Lorenzo Paris
// Description: Triangle Class Definition
// Time spent: 60 minutes
// Date: 6/16/2019
//**************************************************************

package week5;

public class Triangle {
	
	// Instance variables (private)
	private int side1, side2, side3;
	
	// Constructor for Triangle object
	public Triangle (int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	// Method to print the Triangle object
	public String toString()
	{
		String result = "" + side1 + side2 + side3;		
		return result;
	}
	
	// Method to calculate largest side
	private int largest()
	{
		int sideLargest = 0;

	    if(side1 > side2 && side1 > side3)
	    	sideLargest = side1;
	    if(side2 > side1 && side2 > side3)
	    	sideLargest = side2;
	    if(side3 > side1 && side3 > side2)
	    	sideLargest = side3;
	    
	    return sideLargest;
	}

	// Method to calculate shortest side
	private int shortest()
	{
		int sideShortest = 0;

	    if(side1 < side2 && side1 < side3)
	    	sideShortest = side1;
	    if(side2 < side1 && side2 < side3)
	    	sideShortest = side2;
	    if(side3 < side1 && side3 < side2)
	    	sideShortest = side3;
	    
	    return sideShortest;
	}
	
	// Method to calculate if the triangle is equilateral.
	public boolean is_equilateral()
	{
		System.out.print("Equilateral triangle has 3 equal sides.");
		if(largest() == shortest())
			return true;
		else
			return false;		
	}
	
	// Determines whether a triangle is isosceles.
	public boolean is_isosceles()
	{
		System.out.print("Isosceles triangle has 2 equal sides.");
		if(side1 == side2 || side1 == side3)
			return true;
		else
			return false;		
	}

	// Determines whether a triangle is scalene.
	public boolean is_scalene()
	{
		System.out.print("Scalene triangle has no equal sides.");
		if(side1 != side2 && side1 != side3)
			return true;
		else
			return false;		
	}

}

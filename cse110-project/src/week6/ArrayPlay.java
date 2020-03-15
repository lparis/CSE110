package week6;

import java.util.Scanner;


public class ArrayPlay 
{
	Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] myArray = {4, 5, 6, 7, 8, 9};
		System.out.println("Enter the index number");
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();						 			
		
		System.out.println("The value at index " + num + " is " + myArray[num]);
		
		in.close();
	}
}
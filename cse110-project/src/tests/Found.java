package tests;

import java.util.Scanner;
import java.util.Random;

public class Found {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX_CAPACITY = 100;
		Random ranNum = new Random();
		int[] x = new int[MAX_CAPACITY];
		
		for (int j = 0; j < x.length; j++)
		{
			x[j] = Math.abs(ranNum.nextInt() % MAX_CAPACITY + 1);
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print( "Enter number to search for: " );
		int searchInt = scan.nextInt( );
		
		boolean found = false;
		for (int i = 0; i < MAX_CAPACITY; i++)
		{
			if (x[i] == searchInt)
				found = true;
			else
				found = false;
		}
		if (found = true)
			System.out.println("Found");
		else if (found = false)
			System.out.println("Not here");
		
		scan.close();
	}
}

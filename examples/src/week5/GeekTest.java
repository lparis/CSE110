package week5;

import java.util.Scanner;

public class GeekTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in2 = new Scanner(System.in);
 		System.out.println("Enter a number: ");
		int int3 = in2.nextInt();						 			
		System.out.println("Enter a second number: ");			
		int int4 = in2.nextInt();
		System.out.println("The sum between " + int3 + " and " + int4 + " is " + sum(int3, int4));	
		
		in2.close();
	}
	
	public static int sum(int num1, int num2) {
		int sum = 0;
		if (num1 <= num2)
			for (int i = num1; i <= num2; i++)
				sum = sum + i;
		else if (num2 <= num1)
			for (int i = num2; i <= num1; i++)
				sum = sum + i;
		return sum;		

	}
}

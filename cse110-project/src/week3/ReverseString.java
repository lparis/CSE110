package week3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string: ");

        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.print("Reversed string is " + rev);
	
        in.close();
	}
}

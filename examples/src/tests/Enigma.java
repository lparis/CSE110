package tests;

// Scanner package needs to be imported 
import java.util.Scanner;


public class Enigma {

	public static void main(String[ ] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a String");
		// String x = scan.nextString( );
		String x = scan.nextLine(); // Should just be like this
		// int size = x.length;
		int size = x.length(); // Needs to have method parenthesis
		char last = x.charAt(size);
		System.out.println("The last character: " + x + " is " + last);
		
		scan.close();
	}
}	

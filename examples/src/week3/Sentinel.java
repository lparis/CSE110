package week3;

import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String SENTINEL = "ENDOFDATA";
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.println( "Enter lines of data or " + SENTINEL + " to quit" );
		
		while (in.nextLine() != SENTINEL);
		{
			in.nextLine();
			count++;
		}
		
		System.out.println("Number of lines entered = " + count);
		
		in.close();
	}
}

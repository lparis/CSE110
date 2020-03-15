package tests;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println( "Enter the Tests average: ");
		int tests = in.nextInt();
		System.out.println( "Enter the Programs average: ");
		int programs = in.nextInt();
		double testsScore = tests * .60;
		double programScore = programs * .40;
		System.out.println(testsScore);
		System.out.println(programScore);

		in.close();
	}

}

package week4;

import java.util.Scanner;

// Account class
public class AccountObject {

	// Private instance variables
	private String name;
	private int accountNum;
	private double balance;
	
	public AccountObject(String initName, int initId, double initBalance)
	{
		// Account constructor
		name = initName;
		accountNum = initId;
		balance = initBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// type - object - constructor
		Scanner scan = new Scanner(System.in);

		
		// Public methods
		// deposit() method 
		// withdraw() method
		// toString() method
		
		scan.close();

	}

}

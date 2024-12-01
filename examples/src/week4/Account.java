package week4;

// Class Account
public class Account {

	// Private instance variables
	private String name;
	private int accountNum;
	private double balance;
	
	// Class constructor
	public Account(String initName, int initId, double initBalance)
	{
		name = initName;
		accountNum = initId;
		balance = initBalance;
	}
	
	// Public method deposit()
	public double deposit (double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	// Public method withdraw()
	public double withdraw (double amount, double fee)
	{
		balance = balance - amount - fee;
		return balance;
	}
}

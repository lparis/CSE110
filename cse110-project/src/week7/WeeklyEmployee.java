package week7;
import java.text.DecimalFormat;

public class WeeklyEmployee 
{
	// Instance variables / class attributes
	private String empName;
	private double payRate;
	private double hoursWorked;
	
	// Constructor
	public WeeklyEmployee(String name, double rate, double hours) 
	{
		empName = name;
		payRate = rate;
		hoursWorked = hours;
	}
	
	// To string method
    public String toString( )
    {
        DecimalFormat df = new DecimalFormat("0.000");
        return empName + "\n" + df.format(payRate);
    }
    
	// Accessor method to get employee's name
	public String getName() {
		return empName;
	}
	
	// Accessor method to get gross pay
	public double getGrossPay()
	{
		double grossPay = payRate * hoursWorked;
		return grossPay;		
	}
	
	// Mutator method to set the hours
	public void setHours(double hours)
	{
		hoursWorked = hours;		
	}
}

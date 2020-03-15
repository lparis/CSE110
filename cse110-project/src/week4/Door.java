//***********************************************************
// Name: Lorenzo Paris
// Title: Door.java
// Author: Lorenzo Paris
// Description: Door Class Definition
// Time spent: 60 minutes
// Date: 6/16/2019
//**************************************************************

package week4;

// Part 1: Class definition
public class Door {
	
	// Part 2: Instance variables (private)
	private String name;
	private String state;
	
	// Part 3: Constructor
	public Door (String newName, String newState)
	{
		name = newName;
		state = newState;
	}
	
	// Part 4: Accessor methods (gettor methods)
	public String getName() 
	{
		return name;
	}

	public String getState() 
	{
		return state;
	}

	// Part 5: Mutator methods (settor methods)
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setState(String newState)
	{
		state = newState;
	}
	
	// Part 6: Other methods
	public void open()
	{
		state = "open";
	}

	public void close()
	{
		state = "closed";
	}
}

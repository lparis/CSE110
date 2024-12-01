package week5;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Assignment5.java
//SPECIFICATION: Answers questions and keeps a tally
//FOR: CSE 110 - Assignment 5
//TIME SPENT: 60 minutes
//DATE: 6/23/2019
//----------------------------------------------------------------------*/ 

public class SuperHero 
{
    // instance variables go below here
	private static int	numberOfHeroes;
	private String 		heroName, 
						secretIdentity;
	private int 		numberOfLifeChances,
						numberOfPeopleSaved;
	
    // the two constructors go below here
	// Constructor 1: SuperHero hero1 = new SuperHero("Superman", "Clark", 1000);
	public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved) 
	{
	    numberOfHeroes++; // one more hero created
	    numberOfLifeChances = 2; // start the hero with two lives
	    heroName = initHeroName;
	    secretIdentity = initSecretIdentity;
	    numberOfPeopleSaved = initPeopleSaved;
	}
	
	// Constructor 2: SuperHero hero2 = new SuperHero("Batman");
	public SuperHero(String initHeroName) 
	{
	    numberOfHeroes++; // one more hero created
	    numberOfLifeChances = 2; // start the hero with two lives
	    heroName = initHeroName;
	    secretIdentity = "unknown";
	    numberOfPeopleSaved = 0;
	}

    // getNumberOfHeroes() goes below here
	public static int getNumberOfHeroes() 
	{
	    // Put something here (only 1 line is required)
		return numberOfHeroes;
	}
	
    // recordSave() goes below here
	public void recordSave() 
	{
	    numberOfPeopleSaved++;
	}
	
    // the second recordSave method goes here
	public void recordSave(int num) 
	{
	    // Increment numberOfPeopleSaved by num
	    numberOfPeopleSaved = num + numberOfPeopleSaved;
	}
	
    // killHero() goes below here
	public void killHero() 
	{
	    if (numberOfLifeChances > 0) 
	    {
	        // Decrease numberOfLifeChances by 1
	    	numberOfLifeChances--;
	    } else {
	        // Print a message saying the hero is dead
	    	System.out.println("They hero is dead.");
	    }
	}
	
    // printSuperHeroRecord() goes below here
	public void printSuperHeroRecord()
	{
		System.out.println(heroName);
		System.out.println(secretIdentity);
		if (numberOfLifeChances > 0) 
	    {
	    	System.out.println("Status: Alive");
	    } else {
	    	System.out.println("Status: Dead");
	    } 
		System.out.println(numberOfPeopleSaved);
	}
}

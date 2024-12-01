package week5;

/*-------------------------------------------------------------------------
//AUTHOR: Lorenzo Paris 
//FILENAME: Assignment5.java
//SPECIFICATION: Answers questions and keeps a tally
//FOR: CSE 110 - Assignment 5
//TIME SPENT: 60 minutes
//DATE: 6/23/2019
//----------------------------------------------------------------------*/ 

import java.util.Scanner;


public class Lab6 {
	
	public static void main(String[] args) {
	
		// Create a Scanner object for later use
		Scanner scan = new Scanner(System.in);
	
		// Create a superhero called Spider-Man
		System.out.println("Creating Spider-Man.......");
		SuperHero spiderman = new SuperHero("Spider-Man");
		
		// Ask the user to enter a superhero name
		System.out.println("\nWhat is the name of your superhero?");
		String heroName = scan.nextLine(); // This is line 10
		
		System.out.println("What is his secret identity?");
		/** 13: Read in the identity */
		String secretIdentity = scan.nextLine();

		System.out.println("Creating your super hero.......");		
		/** 16: Create the hero called yourHero, who saved 10 people */
		SuperHero myHero = new SuperHero(heroName, secretIdentity, 10);
		
		
		System.out.println("\nSpider-Man just saved 100 lives!");
		/** 19: Call recordSave on spiderman with 100 as the input */
		spiderman.recordSave(100);
		
		System.out.println("Oops, Spider-Man was shot dead twice!");
		/** 22: Kill spiderman twice */
		myHero.killHero();
		
		System.out.print("\nYour hero saved a kidnapped kid ");
		myHero.recordSave();
		
		System.out.println("but was shot once");
		/** 26: Kill your hero once */
		myHero.killHero();
		
		/** 27: Add 1 to your hero’s lives saved */
		System.out.println("\n---- Superhero information ----");
		myHero.recordSave();
		
		/** 30: Store the number of heroes in an int called numHeroes */
		int numHeroes = SuperHero.getNumberOfHeroes();
		System.out.println("There are " + numHeroes + " known superheroes.");
		spiderman.printSuperHeroRecord();
		System.out.println();
		
		/** 33: print the record of yourHero */
		myHero.printSuperHeroRecord();
		
		scan.close();
	}
}

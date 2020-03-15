package week2;
//***********************************************************
// Name: Lorenzo Paris
// Title: Assignment2.java
// Author: Lorenzo Paris
// Description: Computes Burger Orders
// Time spent: 60 minutes
// Date: 6/1/2019
//**************************************************************

/* PART I.1 Answers
 * a) true
 * b) false
 * c) true
 * d) true
 */

/* PART I.2 Answer
 * import java.util.Scanner
 * Scanner in = new Scanner(System.in);
 * System.out.print("Enter your full name: ");
 * fullName = in.nextLine();
 */

/* PART I.3 Answer
 * Hy
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment2
{
     public static void main (String[] args)
     {
         // String variables 
    	 String burger 	= "Hamburger";
    	 String cheese 	= "Cheeseburger";
    	 String fries 	= "French Fries";
    	 String drinks	= "Shake & Beverage";
    	 
    	 // Variables to be calculated
    	 String highestTotalCost;
    	 double totalOrderCost;
    	 int totalItemsOrdered;

    	 int burgersQty;
    	 int cheeseQty;
    	 int friesQty;
    	 int drinksQty;
    	 
    	 // Constants
    	 final double HAMBURGER_PRICE = 2.75;
    	 final double CHEESEBURGER_PRICE = 3.25;
    	 final double FRIES_PRICE = 2.50;
    	 final double DRINKS_PRICE = 1.50;
    	 
    	 // Costs to be calculated
    	 double burgersCost = 0;
    	 double cheeseCost = 0;
    	 double friesCost = 0;
    	 double drinksCost = 0;
    	 
         // Class to get input
         Scanner in = new Scanner(System.in);
         // Class for currency format converter
         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    	 // Display the burger menu
          System.out.println("------------------------------------");    	 
          System.out.println("Welcome to the In-N-Out Burger Menu:");
          System.out.println("------------------------------------");
          System.out.println(burger + " " + currencyFormat.format(HAMBURGER_PRICE));
          System.out.println(cheese + " " + currencyFormat.format(CHEESEBURGER_PRICE));
          System.out.println(fries + " " + currencyFormat.format(FRIES_PRICE));
          System.out.println(drinks + " " + currencyFormat.format(DRINKS_PRICE));

          // Prompt user for input
          System.out.println();          
          System.out.print("How many hamburger(s) would you like to buy? ");
          burgersQty = in.nextInt();
          System.out.print("How many cheeseburger(s) would you like to buy? ");
          cheeseQty = in.nextInt();
          System.out.print("How many French Fries would you like to buy? ");
          friesQty = in.nextInt();
          System.out.print("How many drinks would you like to buy? ");
          drinksQty = in.nextInt();
          
          // Compute costs per item
          burgersCost = burgersQty * HAMBURGER_PRICE;
          cheeseCost = cheeseQty * CHEESEBURGER_PRICE;
          friesCost = friesQty * FRIES_PRICE;
          drinksCost = drinksQty * DRINKS_PRICE;
          
          // Do comparisons to determine which ordered item has the highest cost 
          if (burgersCost > cheeseCost && burgersCost > friesCost && burgersCost > drinksCost)
        	  highestTotalCost = burger;
          else if (cheeseCost > burgersCost && cheeseCost > friesCost && cheeseCost > drinksCost)
        	  highestTotalCost = cheese;
          else if (friesCost > burgersCost && friesCost > cheeseCost && friesCost > drinksCost)
        	  highestTotalCost = fries;
          else
        	  highestTotalCost = drinks;
          
          // Compute total cost and items ordered
          totalOrderCost = burgersCost + cheeseCost + friesCost + drinksCost;
          totalItemsOrdered = burgersQty + cheeseQty + friesQty + drinksQty;
          
          // Display results
          System.out.println();          
          System.out.println (burger + " total cost: " + currencyFormat.format(burgersCost));
          System.out.println (cheese + " total cost: " + currencyFormat.format(cheeseCost));
          System.out.println (fries + " total cost: " + currencyFormat.format(friesCost));
          System.out.println (drinks + " total cost: " + currencyFormat.format(drinksCost));
          System.out.println();
          System.out.println ("Highest total cost item: " + highestTotalCost);
          System.out.println ("Total cost for the order: " + currencyFormat.format(totalOrderCost));
          System.out.println ("Total number of items ordered: " + totalItemsOrdered);
          
          // Close the input scanner
          in.close();
     }
}
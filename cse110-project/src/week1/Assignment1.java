package week1;
//***********************************************************
// Name: Lorenzo Paris
// Title: Assignment1.java
// Author: Lorenzo Paris
// Description: Computes amount to tip
// Time spent: 60 minutes
// Date: 5/26/2019
//**************************************************************

/* PART II.1 Answers
 * a) mystery has the value 5
 * b) mystery now has the value 0
 * c) mystery now has the value 6
 */

/* PART II.2 Answers
 * a) a / b Evaluates to 	0
 * b) (double) b / a 		3.3333333333333335
 * c) a - b / c 			2
 * d) w / (int) y 			4.3
 * e) y / w 				0.24806201550387597
 * f) b % c / a 			3
 * g) b % a 				1
 */


import java.text.NumberFormat;
import java.util.Scanner;

public class Assignment1
{
     // Computes the tip amount based on inputs:
     // tipPercent (int) and billAmount (double)
     public static void main (String[] args)
     {
          
          Scanner in = new Scanner(System.in);
          NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
          
          System.out.print("Enter the amount of your bill: $ ");
          double billAmount = in.nextDouble();
          
          System.out.print("Enter how much percent you want to tip: % ");
          int tipPercent = in.nextInt();

          // compute amounts
          double tipAmount = (tipPercent * billAmount) / 100;
          double totalAmount = tipAmount + billAmount;
          
                  		              
          System.out.println ("Tip amount: " + currencyFormat.format(tipAmount));
          System.out.println ("Total amount with tip: " + currencyFormat.format(totalAmount));
          
          in.close();
     }
}
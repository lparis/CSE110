//***********************************************************
// Name: Lorenzo Paris
// Title: Assignment4.java
// Author: Lorenzo Paris
// Description: Instantiate Triangle Objects
// Time spent: 60 minutes
// Date: 6/16/2019
//**************************************************************

package week4;

import java.util.Scanner;
public class Assignment4 
{

   //===========================================================
   // Create and determine properties of various triangles.
   //===========================================================
   public static void main (String[] args) 
   {
      Scanner console = new Scanner(System.in);
      int num1, num2, num3;
      String another;
      
      // repeat until the user enter 'n'
      do
      {
         // get the input
      	 System.out.println("Enter the sides of the triangle: ");
      	 num1 = console.nextInt();
      	 num2 = console.nextInt();
      	 num3 = console.nextInt();

         // create the Triangle
         Triangle myTriangle = new Triangle (num1, num2, num3);

         // print the Triangle
      	 System.out.println(myTriangle.toString() + " triangle:");
        
         //check the equilateral
      	 if (myTriangle.is_equilateral())
      	   System.out.println("\tIt is equilateral");
      	 else
      	   System.out.println("\tIt is not a equilateral");

      	 //check the isosceles
      	 if (myTriangle.is_isosceles())
      	   System.out.println("\tIt is isosceles");
      	 else
      	   System.out.println("\tIt is not isosceles");

         //check the scalene
      	 if (myTriangle.is_scalene())
      	   System.out.println("\tIt is scalene");
      	 else
      	   System.out.println("\tIt is not scalene");

         // find if the user want to repeat
      	 System.out.println();
      	 System.out.print("Check another Triangle (y/n)? ");
      	 another = console.next();

      } while (another.equalsIgnoreCase("y"));
      
      console.close();

   }  // method main

}  // class Assignment4

//***********************************************************
// Name: Lorenzo Paris
// Title: Lab5.java
// Author: Lorenzo Paris
// Description: Door Objects
// Time spent: 60 minutes
// Date: 6/16/2019
//**************************************************************


package week4;

/**
/**
   A class to test the Door class.
*/
public class Lab5
{
   /**
      Tests the methods of the Door class
      @param args not used
   */
   public static void main(String[] args)
   {
      // Create a Door object, frontDoor which is initially open
      Door frontDoor = new Door("Front", "open");
      System.out.println("The front door is " + frontDoor.getState());
      System.out.println("Expected:  open");
     
      // Create a second Door object, backDoor which is initially closed
      Door backDoor = new Door("Back", "closed");
      System.out.println("The back door is " + backDoor.getState());
      System.out.println("Expected:  closed");

      // Use the mutator to change the state variable of the backDoor object
      backDoor.setState("open");
      System.out.println("The back door is " + backDoor.getState());
      System.out.println("Expected:  open");

      // Use the mutator to change the name variable of the backDoor object
      backDoor.setName("Kitchen");
      System.out.println("The back door is called " + backDoor.getName());
      System.out.println("Expected:  Kitchen");

      // Complete the class as described in Part 8 of the Assignment
      // Create a third Door object, sideDoor which is initially open
      Door sideDoor = new Door("Side", "open");
      System.out.println("The side door is " + backDoor.getState());
      System.out.println("Expected:  open");

      // Use the mutator to change the state variable of the sideDoor object
      backDoor.setState("closed");
      System.out.println("The side door is " + backDoor.getState());
      System.out.println("Expected:  closed");

   }
}


package week3;

import java.util.Scanner;

/**
   This program prints the average of salary values that are terminated with a sentinel.
*/
public class SentinelDemo
{
   public static void main(String[] args)
   {  
      double sum = 0;
      int count = 0;
      double salary = 0;
      System.out.print("Enter one or more salaries; enter -1 when done: ");
      Scanner in = new Scanner(System.in);

      // Process data until the sentinel is entered 

      while (salary != -1)
      {  
         salary = in.nextDouble();
         if (salary != -1) 
         {  
            sum = sum + salary;
            count++;
         }
      }

      // Compute and print the average

      if (count > 0)
      {
         double average = sum / count;
         System.out.println("Average salary: " + average);
      }
      else
      {
         System.out.println("No data");
      }
      
      in.close();
   }
}
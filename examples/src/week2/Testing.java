package week2;

import java.util.Scanner;

public class Testing
{
     public static void main (String[] args)
     {
    	 int x = 3, y = 6;
    	 String fullName;
    	 
    	 System.out.println (x == y / 2);
    	 System.out.println (x % 2 == 0 || y % 2 != 0);
    	 System.out.println (x - y < 0 && !(x >= y));
    	 System.out.println (x + 6 != y || x / y <= 0);
    	 
    	 
	     Scanner in = new Scanner(System.in);
         
	     System.out.print("Enter your full name: ");
	     fullName = in.nextLine();
	     
	     System.out.println(fullName);
	     
	     String str = "Harry";
	     int n = str.length();
	     String mystery = str.substring(0,1) + str.substring(n-1, n);
	     System.out.println(mystery);
	     
	     in.close();
     }
}
package week3;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 10; i++)
		    System.out.println(i);
		
		String str = "Programming";
		for (int i = 1; i < str.length(); i+=3)
		     System.out.println(str.charAt(i));
		
		int x = 1;
		while (x < 30)
		     x *= 2;
		System.out.println(x);
		
//		int j = 0;
//		while( j <= 10 )
//			System.out.println( "Hello" );
		
//		int j = 10;
//		while( j >= 10 )
//		{
//			System.out.print( "Hello" );      
//			j--;
//		}
		
//		int j = 1;
//		while( j <= 5 )
//		System.out.print( "Hello" );      
//		j++;
		
		int j = 1;
		while(j < 5)   
		{
		System.out.print( "Hello" );
		j++;
		}

	}

}

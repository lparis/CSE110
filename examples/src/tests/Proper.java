package tests;
public class Proper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int j, k;
//		
//		for (j = 0; j < 5; j++)
//		{    for (k = 0; k < 5; k++)
//		     {   if (j!=k) 
//		             System.out.print(' ');
//		         else 
//		             System.out.print('*');
//		     System.out.println(  );
//		     }
//		}
		
		int[][] num = { { 3, 2, -1, 3}, {-2, 4, 7, -3}, {9, 4, -1, 0},{2, 8, -3, 7 }};
		
		System.out.println(num.length); 
		System.out.println(num[2].length); 
		System.out.println(num[3][0]); 
		System.out.println(num[2][3]); 
		System.out.println(num[0][3]); 
		System.out.println(num[2][2]); 
		System.out.println(num[0][0]);

	}

}

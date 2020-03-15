package week3;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Example 1:");
		for (int i = 0; i <= 5; i++)
			System.out.print(i);

//		System.out.println("Example 2:");
		for (int j = 5; j >= 0; j--)
			System.out.print(j);

//		System.out.println("Example 3:");
		for (int k = 0; k < 9; k = k + 2)
			System.out.print(k);
		
//		System.out.println("Example 4: Infinite");
//		for (int l = 0; l != 9; l = l + 2)
//			System.out.print(l);

		System.out.println("Example 5:");
		for (int m = 0; m <= 20; m = m * 2)
			System.out.print(m);
		
		System.out.println("Example 6:");
		String str = "Java";
		for (int n = 0; n < str.length(); n++)
		{
			str.charAt(n);
		}

	}
}

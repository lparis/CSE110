package tests;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Arizona_State_University");
		System.out.println(str.charAt(1));
		
		int[] values = {9,4,12,2,6,8,18};
		System.out.println(values[3]);
		System.out.println(values.length);
		
		for (int j=0; j<values.length; j++)
		{
			values[j]++;
			System.out.print(values[j]);
		}
		
		// System.out.println(values[7]);
		System.out.println("");
		System.out.println(isTrue());
		
		int[] list = new int[10];
		
		int[ ] list2 = {5, 10, 15, 20};
		
		int j = 25;
		int k = 34;
		String s = "John Smith";
		
		System.out.println("a) " + k/j);
		System.out.println("b) " + s.charAt(6));
		System.out.println("c) " + s.substring(3, 8));
		System.out.println("d) " + "David".equals("david"));
		System.out.println("e) " + (k > j && k < 34));
		System.out.println("f) " + k % j);
		System.out.println("g) " + (j + k / 4));
		System.out.println("h) " + 2 + 4 + s);
		System.out.println("j) " + s + 2 + 4);
	}
	
	public static boolean isTrue()
	{
		String s1 = "s1";
		String s2 = "s2";
		
		if (s1.length() == s2.length())
			return true;
		else
			return false;
	}
	
	


}

package week6;

public class BoolSort {

	public static void main(String[] args) 
	{
		System.out.print(sort(1, 3, 2));
	}

	public static boolean sort(int num1, int num2, int num3) 
	{
		boolean isSorted = false;
		if (num1 < num2 && num2 < num3)
			isSorted = true;
		else
			isSorted = false;
		return isSorted;
	}
}
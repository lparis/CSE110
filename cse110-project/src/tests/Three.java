package tests;

public class Three {

	public static void main(String[] args) {
		
		int[] array = {6, 7, 3, 5, 2};
		doubleSize(array);
	}
	
	public static int[] doubleSize(int[] arr)
	{
		int doubleArrLength;
		doubleArrLength = arr.length * 2;
		
		int[] dubArr = new int[doubleArrLength];
		
		for (int i = 0; i < dubArr.length; i++)
			System.out.print(dubArr[i]);
		
		return dubArr;
	}
}

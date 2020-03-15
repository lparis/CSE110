package week6;

public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myArray[] = {4, 5, 6, 7, 8, 9};
		// int[] myArray = {4, 5, 6, 7, 8, 9};
		int k = 3;
		mystery(myArray, k);
		for (int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);
		System.out.println("k = " + k);

	}
	
	public static void mystery(int a[], int m)
	{
		++a[m];
		--m;
	}

}

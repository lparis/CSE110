package week6;

public class StringToCharArray 
{
	public static void main(String[] args) {
		
		String str = "Java";
		int strLength = 0;
		char[] stringToCharArray;
		
		strLength = str.length();
		stringToCharArray = new char[strLength]; 
		
		System.out.println("String: \t" + str);

		System.out.print("CharArray: \t");
		
		for (int i = 0; i < stringToCharArray.length; i++)
		{
			stringToCharArray[i] = str.charAt(i);
			System.out.print(stringToCharArray[i] + " ");
		}
	}
}
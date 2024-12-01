package week3;

public class StringLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example: Count number of times a letter appears in a String");
		String str = "Java";
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'A')
				count++;
		}
		System.out.println("String: " + str);
		System.out.println("Letter: 'a' or 'A': ");
		System.out.println("Count:  " + count);
	}
}

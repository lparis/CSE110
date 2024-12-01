package week3;

public class FindFirstMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example: Find First Match");
		boolean found = false;
		String str = "Java";
		char ch;
		int position = 0;
		while (!found && position < str.length())
		{
			ch = str.charAt(position);
			if (Character.isLowerCase(ch))
			{
				found = true;
			}
			else
			{
				position++;
			}
		}
	}
}
			

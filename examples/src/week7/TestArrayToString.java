package week7;

public class TestArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5;
		int columns = 3;

		int[][] array = new int[rows][columns];

		for(int i = 0; i<rows; i++)
		    for(int j = 0; j<columns; j++)
		        array[i][j] = 0;

		for(int i = 0; i<rows; i++)
		{
		    for(int j = 0; j<columns; j++)
		    {
		        System.out.print(array[i][j]);
		    }
		    System.out.println();
		}
	}

}

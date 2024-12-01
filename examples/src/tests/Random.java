package tests;

public class Random {

	public static void main(String[] args) {
		
		java.util.Random generator = new java.util.Random();//accessing Random class
		final int MAX = 1000;
		int[] x = new int[MAX];
		for( int j = 0; j < MAX; j++ )
		{ 
			x[j] = generator.nextInt( MAX ) + 1;
			System.out.println(x[j]);
		}

		double tally = 0;
		double avg;
		for( int j = 0; j < MAX; j++ )
		{ 
			x[j] = generator.nextInt( MAX ) + 1;
			tally += x[j];
		}
		avg = tally/1000;
		System.out.println("Total = " + tally);
		System.out.println("Avg = " + avg);
	}
}

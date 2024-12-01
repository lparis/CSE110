package movie;

public class MovieSeating{

	private Customer seating[][];
	private int row;
	private int column;

	public MovieSeating(int rowNum, int columnNum){

		seating = new Customer[rowNum][columnNum];


		for(int r = 0; r < seating.length; r++){
			for(int c = 0; c < seating[r].length; c++){
				seating[r][c] = new Customer();
			}
		}
	}

	private Customer getCustomerAt(int row, int col){
		return seating[row][col];
	}

	public boolean assignCustomerAt(int row, int col, Customer tempCustomer){
		Customer cur = seating[row][col];
		if (cur.getLastName().equals("???") && cur.getFirstName().equals("???")){
			seating[row][col] = tempCustomer;
			return true;
		}
		else
			return false;
	}

	public boolean checkBoundaries(int row, int col){
		if (row < 0 || col < 0  || row >= seating.length ||
				col >= seating[0].length)
			return false;
		else
			return true;
	}

	public String toString(){
		String seats = "The current seating\n";
		seats+= "-------------------\n";

		for(int r = 0; r < seating.length; r++){
			for(int c = 0; c < seating.length; c++)
				seats += seating[r][c].getFirstName().charAt(0)+ "." +
				seating[r][c].getLastName().charAt(0) + "." + " ";
				seats += "\n";
		}
		return seats;
	}


}


package week6;

public class Box 
{
	private double length;
	private double width;
	private double height;
	
	public Box(double l, double w, double h) 
	{
		length = l;
		width = w;
		height = h;
		
	}
	
	public Box(double s) 
	{
		length = s;
		width = s;
		height = s;		
	}

  public double volume( ) 
  {
    return  length * width * height;
  }
  
  public static void main(String[] args) 
  {
  	Box myBox = new Box(6.0, 4.0, 2.0);
//  	double myVolume = myBox.volume();
//  	System.out.println(myVolume);
  	System.out.println(myBox.volume());
  	
  	myBox.setWidth(4.5);

  }

public void setWidth(double w) 
{
	width = w;
}
  
  

}//end class Box
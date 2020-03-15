/**
 * CLASS RectDriver
 *   Tests the Rectangle class
 */

package week4;

public class RectangleDriver {

	public static void main(String[] args) {
		// Declare a Rectangle
		Rectangle rect1 = new Rectangle();
		rect1.setDimensions(7, 7);
		System.out.println(rect1.getLength() + " " +
			rect1.getWidth() + " " + rect1.getArea() + " " +
			rect1.getPerimeter());
		System.out.println("Square? " + rect1.isSquare());

		Rectangle rect2 = new Rectangle(5, 7);
		System.out.println(rect2.getLength() + " " +
			rect2.getWidth() + " " + rect2.getArea() + " " +
			rect2.getPerimeter());
		System.out.println("Square? " + rect2.isSquare());

	}

}
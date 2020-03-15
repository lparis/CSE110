/**
 * CLASS: CircleDriver
 *   Demonstrates the Circle class
 */

package week5;


public class CircleDriver {

	public static void main(String[] args) {
		Circle circle1 = new Circle(4, "Green");
		Circle circle2 = new Circle(2, "Green");
		Circle circle3 = new Circle(4, "Green");

		System.out.println(circle1.areCirclesEqual(circle2));
		System.out.println(circle3.areCirclesEqual(circle1));
	}

}
/**
 * CLASS: Circle
 *   Represents the basic traits of a circle
 *   
 *   Demonstrates:
 *   
 *   - Creating a simple circle class
 *   - With a method to compare two Circles
 *   - method has a Circle as a parameter
 *   - Calling the method to compare circles in the driver program
 */

package week5;

public class Circle {
	/** Attributes or Instance variables (AKA) */
	private double radius;
	private String color;

	/** Constructor */
	public Circle(double initRadius, String initColor) {
		radius = initRadius;
		color = initColor;
	}

	/** Accessors or Getters (AKA) */
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	/** Compare circles */
	// Method areCirclesEqual() takes Circle object as method argument
	public boolean areCirclesEqual(Circle circle) {
		//circle3.areCirclesEqual(circle1)
		boolean result =
			this.radius == circle.getRadius() &&
			this.color.equalsIgnoreCase(circle.getColor());
		return result;
	}
}
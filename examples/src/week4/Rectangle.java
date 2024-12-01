/**
 * CLASS: Rectangle
 *   Models a rectangle for use in other classes.
 *   This class keeps track of a rectangle's length,
 *   with, area, and perimeter. It also provides a
 *   method to tell if a rectangle is also a square.
 */

package week4;

public class Rectangle {
	/** Attributes/Instance Variables */
	private double length;
	private double width;
	private double area;
	private double perimeter;

	/** Constructors */

	// Rectangle rect = new Rectangle();
	public Rectangle() {
		length = 0;
		width = 0;
		area = 0;
		perimeter = 0;
	}

	// Rectangle rect = new Rectangle(1, 3);
	public Rectangle(double length, double width) {
		// "this" refers to the instance variable
		this.length = length;
		this.width = width;
		calcArea();
		calcPerimeter();
	}

	/** Accessors/Getters */
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	/** Mutators/Setters */
	// setLength(5);
	public void setLength(double newLength) {
		length = newLength;
		calcArea();
		calcPerimeter();
	}

	public void setWidth(double newWidth) {
		width = newWidth;
		calcArea();
		calcPerimeter();
	}

	// setDimensions(4, 3)
	public void setDimensions(double newLength, double newWidth) {
		// At this point, newLength has the value of 4
		// At this point, newWidth has the value of 3
		length = newLength;
		width = newWidth;
		calcArea();
		calcPerimeter();
	}


	/** private methods for calculating the area and perimeter */
	private void calcArea() {
		area = length * width;
	}

	private void calcPerimeter() {
		perimeter = 2 * length + 2 * width;
	}

	/** Return whether the rect is a square */
	public boolean isSquare() {
		return length == width;
	}
}
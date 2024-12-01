/**
 * CLASS: StaticObject
 *   Demonstrates the use of "static" in an object
 *   
 *   This coding demonstration shows:
 *   - static instance variables (why they are needed)
 *   - static instance variables are shared between instances of the same class
 *   - static methods and calling them with the class name
 *   - static methods can only call other static methods and use static instance variables
 */

package week5;

public class StaticObject {
	/** Attributes/Instance variables */
	private static int numObjects;

	/** Constructor */
	public StaticObject() {
		numObjects++;
	}

	/** Getter/Accessor */
	public static int getNumObjects() {
		return numObjects;
	}
}
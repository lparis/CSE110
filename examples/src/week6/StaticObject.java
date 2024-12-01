/**
 * CLASS: StaticObject
 *   Demonstrates the use of "static" in an object
 */

package week6;

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
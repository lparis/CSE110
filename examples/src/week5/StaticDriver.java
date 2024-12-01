/**
 * StaticDriver
 *   Used to display the results of StaticObject.java
 */

package week5;

public class StaticDriver {

	public static void print() {
		System.out.println("Something");
	}

	public static void main(String[] args) {
		// Math.pow(1, 1);

		System.out.println("Number of objects: " + StaticObject.getNumObjects());

		// Create StaticObject
		StaticObject obj1 = new StaticObject();
		StaticObject obj2 = new StaticObject();
		StaticObject obj3 = new StaticObject();
		System.out.println("Number of objects: " + StaticObject.getNumObjects());

		print();
	}

}
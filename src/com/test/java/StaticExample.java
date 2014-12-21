/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 * 
 */
public class StaticExample {

	 static int frogCount = 0; // Declare and initialize

	// instance variable
	public StaticExample() {
		frogCount += 1; // Modify the value in the constructor
	}

	public static void main(String[] args) {
		new StaticExample();
		new StaticExample();
		new StaticExample();
		System.out.println("Frog count is now " + frogCount);
	}

}

/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class Equals {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "first";
		String two = "second";
		
		System.out.println("Equals :::: "+one.equals(two));
		System.out.println("Double Equals :::: "+(one == two));
		System.out.println("one :::: "+one.hashCode()+"  two :::: "+two.hashCode());
	}

}

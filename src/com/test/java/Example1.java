/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 * 
 */
public class Example1 {

	/**
	 * @param args
	 */

	public String returnString(String name, char c) {

		StringBuffer sb = new StringBuffer();
		char compare;
		for (int i = 0; i < name.length(); i++) {
			compare = name.charAt(i);

			if (compare != c) {
				sb.append(compare);
			}
		}
		return sb.toString();
	}

	// Write a java program thats takes a string and a character as input and
	// return the string without that character. Do not use repalce function.
	// For eg google, g should return oole
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 example1 = new Example1();
		System.out.println("Output :::: "
				+ example1.returnString("google", 'o'));
	}

}

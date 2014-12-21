/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class ChildMethodOverride extends ParentMethodOverride {

	/**
	 * @param args
	 */
	
	public int add(int a, int b){
		
		int c = a + b + 10;
		return c;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentMethodOverride parentMethodOverride = new ParentMethodOverride();
		ParentMethodOverride childMethodOverride = new ChildMethodOverride();
		System.out.println("Output ::: "+parentMethodOverride.add(5, 6));
		System.out.println("Output 1 ::: "+childMethodOverride.add(5, 6));
	}

}

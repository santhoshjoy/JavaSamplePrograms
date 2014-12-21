/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class MethodOverloading {

	/**
	 * @param args
	 */
	
	public int test(int a, int b){
		System.out.println("--int--");
		int c = a + b;
		return  c;
	}
	
	public float test(float a, int b){
		System.out.println("--float--");
		float c = a + b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading methodOverloading = new MethodOverloading();
		System.out.println("Output :::"+methodOverloading.test(10f, 11));
	}

}

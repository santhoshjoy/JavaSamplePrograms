/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class AutoBoxing {
	
	/*public int testAutoBox(int i){
		int a = 5;
		int result = a + i;
		return result;
	}*/
	
	public void testInteger(Integer k){
		System.out.println("Integer Object");
	}
	
	public static void main(String a[]){
		AutoBoxing autoBoxing = new AutoBoxing();
		short b = 9;
		System.out.println("Result is --> "+autoBoxing.testAutoBox(b));
		int i = 30;
		new AutoBoxing().testInteger(i);
	}

}

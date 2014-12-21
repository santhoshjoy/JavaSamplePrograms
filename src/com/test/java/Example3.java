/**
 * 
 */
package com.test.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author snatara
 *
 */
public class Example3 {

	/**
	 * @param args
	 */
	
	public int findDuplicateNumber(List<Integer> duplicate){
		
		int store;
		Integer output;
		int i = 1;
		for( Integer dupItr : duplicate){
			store = dupItr.intValue();
		}
		return 0;
	}
	//Find out duplicate number between 1 to N numbers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i < 10; i++){
			list.add(i);
		}
		list.add(6);
		
		Example3 example3 = new Example3();
		System.out.println("Ouput ::: "+example3.findDuplicateNumber(list));
	}

}

/**
 * 
 */
package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author snatara
 *
 */
public class MiddleElement {

	/**
	 * @param args
	 */
	
	public static int findMiddle(int[] array){
		
		List<Integer> sortedList = new ArrayList<Integer>();
		
		for(int i=0; i < array.length; i++){
			sortedList.add(array[i]);
		}
		
		Collections.sort(sortedList);
		
		int middle = sortedList.size()/2;
		
		sortedList.get(middle);
		
		return middle;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,3,5,4,2,6};
		System.out.println("Output ::::: "+findMiddle(array));
	}

}

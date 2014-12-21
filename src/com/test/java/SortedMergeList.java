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
public class SortedMergeList {

	/**
	 * @param args
	 */
	
	public static List<Integer> mergeSort(List<Integer> list1, List<Integer> list2){
		
		for( Integer i : list1){
			
			list2.add(i);
		}
		Collections.sort(list2);
		return list2;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		System.out.println("Output ::::"+mergeSort(list1, list2));
		
	}

}

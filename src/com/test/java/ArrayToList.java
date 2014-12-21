/**
 * 
 */
package com.test.java;

import java.util.Arrays;
import java.util.List;

/**
 * @author snatara
 *
 */
public class ArrayToList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println("Created List Size: "+strList.size());
        System.out.println(strList);
	}

}

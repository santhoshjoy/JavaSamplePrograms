/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class IndexString {

	/**
	 * @param args
	 */
	String s1 = "abqqqqqqqbcdef";
    String s2 = "bcd";
    
	public int findString(){
		for (int i=0; i< s1.length() - s2.length(); i++) {
	        int j = 0;
	        while (j < s2.length() && s2.charAt(j) == s1.charAt(i+j))
	        	j++;
	        if (j == s1.length()) 
	        	return i;
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndexString  indexString = new IndexString();
		System.out.println("Ouput :::: "+indexString.findString());
	    
	    
	}

}

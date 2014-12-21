/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class Example2 {

	/**
	 * @param args
	 */
	
	public String fillSpace(String input){
		
		String output= "";
		for( int i=0; i < input.length(); i++){
			char checkSpace = input.charAt(i);
			if( checkSpace == ' '){
				output += "ABC";
			}else{
				output += checkSpace;
			}
		}
		return output;
	}
	//How to replace the space in the string with "ABC" without using extra memory.. string may contain some extra memory. 
	//str = "i am chandu" -- str contation more memory... 
	//		str = "iABCamABCchandu"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 example2 = new Example2();
		System.out.println("Ouput ::::"+example2.fillSpace("I am Santhosh"));
	}

}

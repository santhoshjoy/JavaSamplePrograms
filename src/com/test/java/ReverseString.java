/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 *
 */
public class ReverseString {
	
	String reverse = "";
    
    public String reverseString(String str){
         int i = str.length()-1;
        if(str.length() == 1){
        	System.out.println("--1--");
            return str;
        } else {
            reverse += str.charAt(i)
                    +reverseString(str.substring(0,i));
            return reverse;
        }
    }
    
   /* public String reverseString1(String str){
    	if(str.length() == 1){
    		return str;
    	}else{
    		for(int i= str.length() -1; i >=0; i--){
    			reverse += str.charAt(i);
    		
    		}
    		
    		return reverse;
    	}
    }
     */
    public static void main(String a[]){
    	ReverseString srr = new ReverseString();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
    	//  System.out.println("Result: "+srr.reverseString1("Java2novice"));
    }
    
    

}

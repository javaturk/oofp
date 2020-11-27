/**
 * 
 */
package org.javaturk.oofp.ch06.assertion;


public class AssertionExample {

	public static void main(String[] args) {
		int i = 121;
		
		assert i > 3;  // Here, i must be greater than 3!
		
//		assert i > 6;
		
		assert i > 16 : "Must be more than 16";
	}
}

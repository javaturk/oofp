
package org.javaturk.oofp.ch04.anonymous.doer;

public class DoerClassTest {

	public static void main(String[] args) {
		callDoerClass();
	}
	
	public static void callDoerClass(){
		DoerInterface doer = new DoerClass();
		doer.doIt();
		doer.doThat();
	}
}

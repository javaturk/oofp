package org.javaturk.oofp.ch03.newFeatures.staticMethods;

public interface Printable {
	
	void view();
	
	void print();
	
	default void format(){
		System.out.println("Printable is being formatted.");
	}
	
	static void startPrinting(){
		System.out.println("Printing has been started.");
	}
}

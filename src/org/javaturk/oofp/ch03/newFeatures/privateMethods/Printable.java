package org.javaturk.oofp.ch03.newFeatures.privateMethods;

public interface Printable {
	
	void view();
	
	void print();
	
	default void format(){
		pleasePrint("Printable is being formatted.");
		pleaseStartPrinting("Printable is being formatted.");
	}
	
	private void pleasePrint(String message){
		System.out.println("Message: " + message);
	}
	
	static void startPrinting(){
		pleaseStartPrinting("Printing has been started.");
	}
	
	private static void pleaseStartPrinting(String message){
		System.out.println("Message: " + message);
	}
}

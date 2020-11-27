
package org.javaturk.oofp.ch03.newFeatures.staticMethods;

public interface SubPrintable extends Printable{

	static void startPrinting(){
		System.out.println("SubPrinting has been started.");
	}
}

package org.javaturk.oofp.ch03.newFeatures.privateMethods;

public class TestPrivateMethod {

	public static void main(String[] args) {
		Printable printable = new Document();
		printable.print();
		printable.view();
		printable.format();
	}
}

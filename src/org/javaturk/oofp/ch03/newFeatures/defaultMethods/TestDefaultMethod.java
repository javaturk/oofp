package org.javaturk.oofp.ch03.newFeatures.defaultMethods;

public class TestDefaultMethod {

	public static void main(String[] args) {
		Printable printable = new Document();
		printable.print();
		printable.view();
		printable.format();
	}
}

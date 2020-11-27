package org.javaturk.oofp.ch03.newFeatures.staticMethods;

public class Document implements Printable {

	@Override
	public void view() {
		System.out.println("Document is being viewed.");
	}

	@Override
	public void print() {
		System.out.println("Document is being printed.");
	}
	
	@Override
	public void format(){
		System.out.println("Document is being formatted.");
	}
}

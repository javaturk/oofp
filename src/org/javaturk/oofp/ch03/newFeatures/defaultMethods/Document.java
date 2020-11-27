package org.javaturk.oofp.ch03.newFeatures.defaultMethods;

public class Document implements Printable {

//	@Override
//	public void view() {
//		throw new UnsupportedOperationException("Printable.view");
//		
//	}
//
//
//	@Override
//	public void print() {
//		throw new UnsupportedOperationException("Printable.print");
//		
//	}

	@Override 
	public void view() {
		System.out.println("Document is being viewed.");
	}

	@Override
	public void print() {
		System.out.println("Document is being printed.");
	}
	
//	@Override
//	public void format(){
//		System.out.println("Document is being formatted.");
//	}

}

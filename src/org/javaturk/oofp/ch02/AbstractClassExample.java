
package org.javaturk.oofp.ch02;

public class AbstractClassExample extends AbstractClass {
	
//	public void aMethod() {
//		System.out.println("aMethod() in AbstractClassExample");
//	}
	
	@Override
	public void anotherMethod() {
		System.out.println("anotherMethod() in AbstractClassExample");
	}
	
	public static void main(String[] args) {
//		AbstractClass o1 = new AbstractClass();
		AbstractClassExample o2 = new AbstractClassExample();
		o2.aMethod();
		o2.anotherMethod();
	}
}

abstract class AbstractClass {
	
	public void aMethod() {
		System.out.println("aMethod() in AbstractClass");
	}

	public abstract void anotherMethod();
}

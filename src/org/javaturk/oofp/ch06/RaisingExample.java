package org.javaturk.oofp.ch06;

public class RaisingExample {

	public static void main(String[] args) throws Throwable  {
		doSomething();
		System.out.println("After doSomething()!");
	}
	
	private static void doSomething() throws Throwable {
		doSomethingElse();		
	}
	
	private static void doSomethingElse() throws Throwable {
		throwAThrowable();		
	}

	public static void throwAThrowable() throws Throwable {
		Throwable throwable = new Throwable("Just kidding!");
		throw throwable;
	}
}

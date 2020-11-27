package org.javaturk.oofp.ch06;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			throwAThrowable();
		} catch (Throwable e) {
			System.out.println("Catching ");
			e.printStackTrace();
		}
	}

	public static void throwAThrowable() throws Throwable {
		Throwable throwable = new Throwable("Just kidding!");
		throw throwable;
	}
}

package org.javaturk.oofp.ch06;

public class ErrorExample {

	public static void main(String[] args) {
//		throwError1();
//		throwError2();
		recursiveMethod();
	}

	public static void throwError1() {
		System.out.println("I'll throw an error now!");
		throw new OutOfMemoryError("Just kidding!");
	}

	public static void throwError2() {
		System.out.println("I'll throw an error now!");
		try {
			throw new OutOfMemoryError("Just kidding!");
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

	public static void recursiveMethod() {
		recursiveMethod();
	}
}

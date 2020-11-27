package org.javaturk.oofp.ch06;

public class CatchingExample {

	public static void main(String[] args) {
		// doSomething();

		try {
			doSomething();
			System.out.println("After doSomething()1!");
		} catch (Throwable e) {
			System.out.println("Catching a Throwable: " + e.getMessage());
		}
		System.out.println("After doSomething()2!");
	}

	private static void doSomething() throws Throwable { // No need for throws
		doSomethingElse();
	}

	private static void doSomethingElse() throws Throwable {
		throwAThrowable();
	}

	public static void throwAThrowable() throws Throwable {
		double random = Math.random();
		if (random < 0.5) {
			System.out.println("I have a problem while I am doing my work :(. Random: " + random);
			Throwable throwable = new Throwable("Just kidding!");
			throw throwable;
		} else
			System.out.println("I am doing my work without any problem at all:)");
	}
}

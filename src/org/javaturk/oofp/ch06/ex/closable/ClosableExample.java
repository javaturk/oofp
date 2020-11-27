package org.javaturk.oofp.ch06.ex.closable;

public class ClosableExample {

	public static void main(String[] args) {
		run3();
	}

	public static void run0() {
		ClosableClass cc = null;
		try {
			cc = new ClosableClass("unique", false);
			System.out.println("in try block.");
			throwException();
			cc.close();
		} catch (Exception e) {
			System.out.println("in catch block.");
			try {
				if (cc.isOpen())
					cc.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		finally {
			System.out.println("in finally()");
			try {
				if (cc.isOpen())
					cc.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("After try block.");
	}

	public static void run1() {
		try (ClosableClass cc = new ClosableClass("unique", false)) {
			System.out.println("in try block.");
			throwException();
		} catch (Exception e) {
			System.out.println("in catch block.");
		}
		finally{
			System.out.println("finally here :)");
		}
		System.out.println("After try block.");
	}

	public static void run2() {
		try (ClosableClass cc1 = new ClosableClass("first", false); ClosableClass cc2 = new ClosableClass("second", false)) {
			System.out.println("in try block.");
			throwException();
		} catch (Exception e) {
			System.out.println("in catch block.");
		}
		finally{
			System.out.println("finally here :)");
		}
		System.out.println("After try block.");
	}

	public static void run3() {
		try (ClosableClass cc1 = new ClosableClass("first", false); ClosableClass cc2 = new ClosableClass("second", true)) {
			System.out.println("in try block.");
			throwException();
		} catch (Exception e) {
			System.out.println("in catch block.");
		}
		finally{
			System.out.println("finally here :)");
		}
		System.out.println("After try block.");
	}

	public static void throwException() throws Exception {
		double random = Math.random();
		if (random < 0.5) {
			System.err.println("Throwing an exception!");
			throw new Exception();
		}
	}
}

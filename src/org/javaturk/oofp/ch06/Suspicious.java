package org.javaturk.oofp.ch06;

public class Suspicious {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("A");
				bad();
			} catch (Exception e) {
				bad();
				System.out.println("B");
			} finally {
				System.out.println("C");
			}
		} catch (Exception e) {
			System.out.println("E");
		}
		System.out.println("G");
	}

	public static void bad() throws Exception {
		try {
			System.out.println("F");
			throw new Exception();
		} finally {
			System.out.println("D");
		}
	}
}

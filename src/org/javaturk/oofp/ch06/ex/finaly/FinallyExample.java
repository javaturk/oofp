package org.javaturk.oofp.ch06.ex.finaly;

public class FinallyExample {

	public static void main(String[] args) {
		System.out.println("in main(), before calling divide()");
		// divide(20, 10);
		try {
			divide(20, 0);
			System.out.println("in try block in main(). Just after calling divide()\n");
		} catch (ArithmeticException e) {
			System.out.println("Problem with the division.");
			System.out.println("Message: " + e.getMessage());
			divide(20, 5);
		} finally {
			System.out.println("in finally");
		}
		System.out.println("in main(), after calling divide()\n");
	}

	public static void divide(int num1, int num2) {
		System.out.println("in divide() with arguments: " + num1 + " and " + num2);
		if (num2 == 0)
			throw new ArithmeticException("0'a bolemezsiniz.");
		else {
			int division = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + division);
		}
	}
}

package org.javaturk.oofp.ch06.ex.division;

public class DivisionByZero2 {

	public static void main(String[] args) {
//		divide(20, 0);
		try {
			divide(20, 0);
			System.out.println("After division.");
		} catch (ArithmeticException e) {
			System.out.println("Problem with the division.");
			System.out.println("Message: " + e.getMessage());
			divide(20, 5);
		}
		System.out.println("After try-catch.");
	}

	public static void divide(int num1, int num2){
		System.out.println("in divide() with arguments: " + num1 + " and " + num2);
		if (num2 == 0)
			throw new ArithmeticException("0'a bolme yapamazsiniz.");
		else {
			int division = num1 / num2;
			System.out.println(num1 + "/" + num2 + " = " + division);
		}
	}
}

package org.javaturk.oofp.ch06.assertion;

public class SqrtCalculator {

	public static void main(String[] args) {
		SqrtCalculator sq = new SqrtCalculator();

		System.out.println(sq.sqrt2(625));
		System.out.println(sq.sqrt2(12));
		System.out.println(sq.sqrt2(17));
	}

	public double sqrt1(int x) {
//		return Math.sqrt(x);
		if (x < 0)
			throw new IllegalArgumentException("Negative number!" + x); //
		else
			return Math.sqrt(x);
	}

	public double sqrt2(int x) {
		assert x >= 0 : "Negative number: " + x;
//		assert x >= 0 : f2(x);
		return Math.sqrt(x);
	}

	private String f1(int x) {
		return "Negativve number: " + x;
	}

	private StringBuffer f2(int x) {
		return new StringBuffer("Negativve number: " + x);
	}
}

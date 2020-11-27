package org.javaturk.oofp.ch03.math.calculator3;

public class CosFunction implements SingleArgMathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}

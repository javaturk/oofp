package org.javaturk.oofp.ch03.math.calculator3;

public class LogFunction implements SingleArgMathFunction {
	private static String name = "Log";

	public String getName() {
		return name;
	}

	public double calculate(double arg) {
		return Math.log(arg);
	}
}

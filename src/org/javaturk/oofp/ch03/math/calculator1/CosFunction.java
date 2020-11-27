package org.javaturk.oofp.ch03.math.calculator1;

public class CosFunction implements MathFunction {

	private static String name = "Cos";

	public String getName() {
		return name;
	}
	
	public double calculate(double arg) {
		return Math.cos(arg);
	}
}

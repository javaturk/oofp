package org.javaturk.oofp.ch03.math.calculator3;


public class SinFunction implements SingleArgMathFunction {
	
	private static String name = "Sin";

	public String getName() {
		return name;
	}
	
	public double calculate(double arg) {
		return Math.sin(arg);
	}
}

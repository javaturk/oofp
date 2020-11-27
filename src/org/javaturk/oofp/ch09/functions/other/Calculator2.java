package org.javaturk.oofp.ch09.functions.other;

import java.util.function.BiFunction;

public class Calculator2 {
	private BiFunction<Double, Double, Double> adder = (arg1, arg2) -> arg1 + arg2;
	private BiFunction<Double, Double, Double> subtracter = (arg1, arg2) -> arg1 - arg2;
	private BiFunction<Double, Double, Double> multiplier = (arg1, arg2) -> arg1 * arg2;
	private BiFunction<Double, Double, Double> divider = (arg1, arg2) -> arg1 / arg2;

	public double add(double arg1, double arg2) {
		return adder.apply(arg1, arg2);
	}

	public double subtract(double arg1, double arg2) {
		return subtracter.apply(arg1, arg2);
	}

	public double multiply(double arg1, double arg2) {
		return multiplier.apply(arg1, arg2);
	}

	public double divide(double arg1, double arg2) {
		return divider.apply(arg1, arg2);
	}

	public static void main(String[] args) {
		Calculator2 calculator = new Calculator2();
		System.out.println(calculator.add(22, 19));
		System.out.println(calculator.divide(7, 3));
	}
}

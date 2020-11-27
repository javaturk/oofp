package org.javaturk.oofp.ch09.functions;

import java.util.Comparator;
import java.util.function.*;

public class OperatorExample {

	public static void main(String[] args) {
		unaryOperatorExample();
//		binaryOperatorExample();
	}

	public static void unaryOperatorExample() {

		Function<Integer, Integer> squareFunction = num -> num * num;
		System.out.println(squareFunction.apply(3));

		UnaryOperator<Integer> squareOperator = num -> num * num;
		System.out.println(squareOperator.apply(3));

		System.out.println();

		Function<Double, Double> squaredFunction = num -> Math.sqrt(num);
		System.out.println("5 squared: " + squaredFunction.apply(5.0));

		UnaryOperator<Double> squaredOperator = num -> Math.sqrt(num);
		System.out.println("5 squared: " + squaredOperator.apply(5.0));

		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("This is my message in upper case"));
		
		UnaryOperator<Integer> identityOperator = UnaryOperator.identity();
		int result = identityOperator.apply(10);
		System.out.println(result);
	}

	public static void binaryOperatorExample() {

		BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
		System.out.println(concat.apply("I love these ", "built-in functions in Java!"));

		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10 + 25 = " + add.apply(10, 25));

		Comparator<Integer> comparator = (i1, i2) -> i1 - i2;

		BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy(comparator);
		BinaryOperator<Integer> minOperator = BinaryOperator.minBy(comparator);

		System.out.println("Max: " + maxOperator.apply(32, 23));
		System.out.println("Min: " + minOperator.apply(32, 23));
		System.out.println("Max or min?: " + maxOperator.apply(23, 23));
	}
}

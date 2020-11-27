package org.javaturk.oofp.ch11.wildcard;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WrapperGenerics {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(6);
		ints.add(new Integer(8));
		short s = 7;
		// ints.add(new Short(s)); // Compiler error!
		// ints.add(new Long(12L)); // Compiler error!
		System.out.printf("%-30s %-20s\n", "List<Integer>:", ints);

		List<Number> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(new Integer(5));
		s = 7;
		numbers.add(new Short(s)); // Not a compiler error!
		numbers.add(new Long(12L)); // Not a compiler error!
		System.out.printf("%-30s %-20s\n", "List<Number>:", numbers);

		List<Number> squares = square1(numbers);
		System.out.printf("%-30s %-20s\n", "List<Number> squares:", squares);
		
		squares = square2(numbers);
		System.out.println(squares);

//		squares = square1(ints); // Can't do this.
		squares = square2(ints);
		System.out.println(squares);

	}

	public static List<Number> square1(List<Number> numbers) {
		List<Number> squares = new ArrayList<>(numbers.size());
		numbers.forEach((Number n) -> {
			double value = n.doubleValue();
			Double squareValue = value * value;
			squares.add(squareValue);
		});
		return squares;
	}

	public static List<Number> square2(List<? extends Number> numbers) {
		Function<Number, Number> square = x -> x.doubleValue() * x.doubleValue();
		List<Number> squares = numbers.stream().map(square).collect(Collectors.toList());
		return squares;
	}
}

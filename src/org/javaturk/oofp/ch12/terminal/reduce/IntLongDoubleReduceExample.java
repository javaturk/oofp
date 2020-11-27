package org.javaturk.oofp.ch12.terminal.reduce;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Random;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntLongDoubleReduceExample {

	public static void main(String[] args) {
//		 intStreamExamples();
//		doubleStreamExamples();
		longStreamExamples();
	}

	public static void intStreamExamples() {
		IntStream stream = generateIntStream1();
		System.out.print("Int stream: ");
		stream.forEach((i) -> System.out.print(i + " "));

//		In case of calling generateIntStream2(), limit it otwerwise it produces infinitely!
//		IntStream stream = generateIntStream2();
//		System.out.print("Int stream: ");
//		stream.limit(10).forEach((i) -> System.out.print(i + " "));

		System.out.println();

		stream = generateIntStream1();
		int sum = stream.sum();
		System.out.println("Sum of integers: " + sum);

		stream = generateIntStream1();
		OptionalInt min = stream.min();
		if (min.isPresent())
			System.out.println("Min of integers: " + min.getAsInt());
		else
			System.out.println("Min of integers: NONE");

		stream = generateIntStream1();
		OptionalInt max = stream.max();
		if (max.isPresent())
			System.out.println("max of integers: " + max.getAsInt());
		else
			System.out.println("max of integers: NONE");

		stream = generateIntStream1();
		OptionalDouble average = stream.average();
		if (average.isPresent())
			System.out.println("Average of integers: " + average.getAsDouble());
		else
			System.out.println("Average of integers: NONE");

		stream = generateIntStream1();
		IntBinaryOperator intBinaryOperator1 = (i, j) -> i + j;
		OptionalInt value1 = stream.reduce(intBinaryOperator1);
		if (value1.isPresent())
			System.out.println("Sum of integers using operator: " + value1.getAsInt());
		else
			System.out.println("Sum of integers using operator: NONE");

		stream = generateIntStream1();
		IntBinaryOperator intBinaryOperator2 = (i, j) -> i + j;
		int value2 = stream.reduce(0, intBinaryOperator2);
		System.out.println("Sum of integers using operator with an initial value: " + value2);
	}

	public static void longStreamExamples() {
		LongStream stream = generateLongStream();
		System.out.print("Long stream: ");
		stream.forEach((l) -> System.out.print(l + " "));

		System.out.println();

		stream = generateLongStream();
		long sum = stream.sum();
		System.out.println("Sum of longs: " + sum);

		stream = generateLongStream();
		stream = stream.peek((l) -> System.out.print(l + " "));
		OptionalLong min = stream.min();
		if (min.isPresent())
			System.out.println("Min of longs: " + min.getAsLong());
		else
			System.out.println("Min of longs: NONE");

		stream = generateLongStream();
		OptionalLong max = stream.max();
		if (max.isPresent())
			System.out.println("Max of longs: " + max.getAsLong());
		else
			System.out.println("Max of longs: NONE");

		stream = generateLongStream();
		OptionalDouble average = stream.average();
		if (average.isPresent())
			System.out.println("Average of longs: " + average.getAsDouble());
		else
			System.out.println("Average of longs: NONE");

		stream = generateLongStream();
		LongBinaryOperator longBinaryOperator1 = (i, j) -> i + j;
		OptionalLong value1 = stream.reduce(longBinaryOperator1);
		if (value1.isPresent())
			System.out.println("Sum of longs using operator: " + value1.getAsLong());
		else
			System.out.println("Sum of longs using operator: NONE");

		stream = generateLongStream();
		LongBinaryOperator longBinaryOperator2 = (i, j) -> i + j;
		long value2 = stream.reduce(0, longBinaryOperator2);
		System.out.println("Sum of longs using operator with an initial value: " + value2);
	}

	public static void doubleStreamExamples() {
		DoubleStream stream = generateDoubleStream();
		stream.forEach((s) -> System.out.println("Stream: " + s));

		System.out.println();

		stream = generateDoubleStream();
		double sum = stream.sum();
		System.out.println("Sum of doubles: " + sum);

		stream = generateDoubleStream();
		OptionalDouble min = stream.min();
		if (min.isPresent())
			System.out.println("Min of doubles: " + min.getAsDouble());

		stream = generateDoubleStream();
		OptionalDouble max = stream.max();
		if (max.isPresent())
			System.out.println("Max of doubles: " + max.getAsDouble());

		stream = generateDoubleStream();
		OptionalDouble average = stream.average();
		if (average.isPresent())
			System.out.println("Average of doubles: " + average.getAsDouble());

		stream = generateDoubleStream();
		DoubleBinaryOperator doubleBinaryOperator1 = (i, j) -> i + j;
		OptionalDouble value1 = stream.reduce(doubleBinaryOperator1);
		if (value1.isPresent())
			System.out.println("Sum of doubles: " + value1.getAsDouble());

		stream = generateDoubleStream();
		DoubleBinaryOperator doubleBinaryOperator2 = (i, j) -> i + j;
		double value2 = stream.reduce(0, doubleBinaryOperator2);
		System.out.println("Sum of doubles: " + value2);
	}

	public static IntStream generateIntStream1() {
		return IntStream.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
	}

	public static IntStream generateIntStream2() {
		return IntStream.generate(() -> (int) (100 * Math.random()));
	}

	public static LongStream generateLongStream() {
		LongPredicate hasNext = (l) -> l <= 1_000_000_000_000_000_000L;
		Random random = new Random();
		LongUnaryOperator next = (d) -> random.nextLong();
		return LongStream.iterate(random.nextLong(), hasNext, next);
	}

	public static DoubleStream generateDoubleStream() {
		DoublePredicate hasNext = (d) -> d <= 0.9;
		DoubleUnaryOperator next = (d) -> Math.random();
		return DoubleStream.iterate(Math.random(), hasNext, next);
	}

	// public static DoubleStream generateDoubleStream() {
	// DoublePredicate hasNext = (d) -> {System.out.println("in DoublePredicate");
	// return d <= 0.9;};
	// DoubleUnaryOperator next = (d) -> {System.out.print("in DoubleUnaryOperator:
	// "); double random = Math.random(); System.out.println(random);return
	// random;};
	// double random = Math.random();
	// System.out.println("Initial: " + random);
	// return DoubleStream.iterate(random, hasNext, next);
	// }
}

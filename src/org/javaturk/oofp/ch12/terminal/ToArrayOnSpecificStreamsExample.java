package org.javaturk.oofp.ch12.terminal;

import java.util.Random;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ToArrayOnSpecificStreamsExample {
	public static void main(String[] args) {
	
		System.out.println("\nNew int array");
		IntStream intStream = generateIntStream1();
		int[] integers = intStream.toArray();
		System.out.print("[");
		for(int i : integers)
			System.out.print(i + ", ");
		System.out.println("]");
		
		System.out.println("\nNew long array");
		LongStream longStream = generateLongStream();
		long[] longs = longStream.toArray();
		System.out.print("[");
		for(long i : longs)
			System.out.print(i + ", ");
		System.out.println("]");
		
		System.out.println("\nNew double array");
		DoubleStream doubleStream = generateDoubleStream();
		double[] doubles = doubleStream.toArray();
		System.out.print("[");
		for(double i : doubles)
			System.out.print(i + ", ");
		System.out.println("]");
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
}

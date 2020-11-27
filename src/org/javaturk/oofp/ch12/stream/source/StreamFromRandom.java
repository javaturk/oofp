package org.javaturk.oofp.ch12.stream.source;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFromRandom {

	public static void main(String[] args) {
		Random random = new Random();

		DoubleStream doubleStream = random.doubles(10);
		doubleStream.forEach(element -> System.out.printf("%s\n", element));

		System.out.println();

		IntStream intStream = random.ints(50);
		intStream.forEach(element -> System.out.printf("%s\n", element));
	}
}

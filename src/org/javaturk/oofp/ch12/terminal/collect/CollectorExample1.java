package org.javaturk.oofp.ch12.terminal.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collector.Characteristics;

public class CollectorExample1 {
	public static void main(String[] args) {
		 runNameJoiner();
//		 runNameLengthAdder();
//		runNameLengthAdderThatDontWork();
//		runNameLengthAdderMechanism();
	}

	public static void runNameJoiner() {
		System.out.println("Name joiner 1");
		Stream<String> nameStream = generateNameStream();
		Supplier<StringJoiner> joiner = () -> new StringJoiner(" | ");
		BiConsumer<StringJoiner, String> accumulator = (j, s) -> j.add(s.toUpperCase());
		BinaryOperator<StringJoiner> combiner = (j1, j2) -> j1.merge(j2);
		Function<StringJoiner, String> finisher = (j) -> j.toString();
		Collector<String, StringJoiner, String> nameCollector = Collector.of(joiner, // supplier
				accumulator, // accumulator
				combiner, // combiner
				StringJoiner::toString); // finisher

		String names = nameStream.parallel().collect(nameCollector);
		System.out.println(names);

		System.out.println("\nName joiner 2");
		Stream<String> nameStream2 = generateNameStream();
		Collector<String, StringJoiner, String> nameCollector2 = Collector.of(() -> new StringJoiner(" | "), // supplier
				(j, s) -> j.add(s.toUpperCase()), // accumulator
				(j1, j2) -> j1.merge(j2), // combiner
				StringJoiner::toString); // finisher

		String names2 = nameStream2.collect(nameCollector2);
		System.out.println(names2);
	}

	public static void runNameLengthAdder() {
		System.out.println("Name length adder");
		Stream<String> nameStream = generateNameStream();
		Supplier<Sum> supplier = () -> new Sum();
		BiConsumer<Sum, String> accumulator = (sum, s) -> sum.add(s.length());
		BinaryOperator<Sum> combiner = (sum1, sum2) -> {
			sum1.add(sum2);
			return sum1;
		}; // This can be anything if it is not parallel.
		Function<Sum, Integer> finisher = (sum) -> sum.getLength();
		Collector<String, Sum, Integer> sumCollector = Collector.of(supplier, accumulator, combiner, finisher);
		Integer sum = nameStream.collect(sumCollector);
		System.out.println("Sum: " + sum);
	}

	public static void runNameLengthAdderMechanism() {
		// This is how it works.
		System.out.println("\nName length adder, this is how it works.");
		Stream<String> nameStream = generateNameStream();
		Supplier<Sum> supplier = () -> {
			System.err.println("Thread name: " + Thread.currentThread().getName());
			Sum sumObject = new Sum();
			System.out.println("Supplier supplying a sum object: " + sumObject);
			return sumObject;
		};
		BiConsumer<Sum, String> accumulator = (sumObject, s) -> {
			System.out.println("BiConsumer before: sum: " + sumObject + " s.length: " + s.length());
			sumObject.add(s.length());
			System.out.println("BiConsumer after: sum: " + sumObject);
		};
		BinaryOperator<Sum> combiner = (sumObject1, sumObject2) -> {
			System.out.println("BinaryOperator: sumObject1 " + sumObject1 + " sumObject2: " + sumObject2);
			sumObject1.add(sumObject2);
			return sumObject1;
		};

		Function<Sum, Integer> finisher = (sumObject) -> {
			Integer length = sumObject.getLength();
			System.out.println("In finisher: Converting " + sumObject + " to " + length);
			return length ;};

		Collector<String, Sum, Integer> sumCollector = Collector.of(supplier, accumulator, combiner, finisher);
		// Sum sumProduced = nameStream.parallel().collect(sumCollector);
		// int sum = sumProduced.getLength();
//		int sum = nameStream.collect(sumCollector);
		int sum = nameStream.parallel().collect(sumCollector);
		System.out.println("Sum: " + sum);
	}

	public static void runNameLengthAdderThatDontWork() {
		Supplier<Integer> supplier = () -> 10;
		BiConsumer<Integer, String> accumulator = (length, s) -> length += s.length();
		BinaryOperator<Integer> combiner = (i1, i2) -> i1 + i2;
		// Characteristics characteristics;
		Collector<String, Integer, Integer> sumCollector = Collector.of(supplier, accumulator, combiner);
		Stream<String> nameStream = generateNameStream();
		Integer sum = nameStream.collect(sumCollector);
		System.out.println("Sum: " + sum);
	}

	public static Stream generateNameStream() {
		return Stream.of("Alican", "Veli", "Nil", "Selim", "Nuri", "Zeynep");
	}
}

class Sum {
	private int length = 0;

	public void add(int length) {
		this.length += length;
	}

	public int getLength() {
		return length;
	}

	public void add(Sum sum) {
		this.length += sum.length;
	}

	public String toString() {
		return "[Sum: " + length + "]";
	}
}

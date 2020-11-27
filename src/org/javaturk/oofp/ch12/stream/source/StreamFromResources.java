package org.javaturk.oofp.ch12.stream.source;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.CollectionFactory;

public class StreamFromResources {

	public static void main(String[] args) throws InterruptedException {
//		fromCollections();
//		ofMethods();
		arraysMethods();
	}

	public static void fromCollections() {
		List<String> names = CollectionFactory.getNameList();

		Stream<String> sequentialStream1 = names.stream();
//		System.out.println("Stream: " + sequentialStream1);
		sequentialStream1.forEach(element -> System.out.printf("%s\n", element));

		Stream<String> parallelStream1 = names.parallelStream();
		System.out.println("\nParallel stream: " + parallelStream1);
		parallelStream1.forEach(element -> System.out.printf("%s\n", element));

		Stream<String> sequentialStream2 = Stream.of("Kemal", "Selim", "Cemalettin", "Ebru", "Harun");
//		System.out.println("\nStream: " + sequentialStream2);
		sequentialStream2.forEach(element -> System.out.printf("%s\n", element));

//		Stream<String> parallelStream2 = names.parallelStream();
//		System.out.println("\nParallel stream: " + parallelStream2);
//		parallelStream2.forEach(element -> System.out.printf("%s\n", element));
	}

	public static void ofMethods() throws InterruptedException {
		Stream<String> stringStream = Stream.of("Ayse", "Fatma", "Zeynep");
		stringStream.forEach(element -> System.out.printf("%s\n", element));
		
		Stream<Integer> intStream = Stream.of(3, 6, 9, 12, 15);
		intStream.forEach(element -> System.out.printf("%s\n", element));
		
		IntStream intStream2 = IntStream.of(3, 6, 9, 12, 15);
		intStream2.forEach(element -> System.out.printf("%s\n", element));
		
		DoubleStream doubleStream2 = DoubleStream.of(3.14, 6.0, 9.4221450193, 12.00, 15.2285295453);
		doubleStream2.forEach(element -> System.out.printf("%s\n", element));
		
		Date date1 = new Date();
		Thread.sleep(1000);
		Date date2 = new Date();
		Thread.sleep(1000);
		Date date3 = new Date();
		Stream<Date> dateStream = Stream.of(date1, date2, date3);
		dateStream.forEach(element -> System.out.printf("%s\n", element));
	}

	public static void arraysMethods() {
		int[] intArray = CollectionFactory.getIntArray();
		IntStream intStream = Arrays.stream(intArray);
//		System.out.println("\nStream: " + intStream);
		intStream.forEach(element -> System.out.printf("%s\n", element));

		System.out.println();

		long[] longArray = CollectionFactory.getLongArray();
		LongStream longStream = Arrays.stream(longArray);
//		System.out.println(longStream);
		longStream.forEach(element -> System.out.printf("%s\n", element));

//		longStream = Arrays.stream(longArray);
//		LongStream longParallelStream = longStream.parallel();
//		System.out.println("Long parallel stream: " + longParallelStream);
//		longParallelStream.forEach(element -> System.out.printf("%s\n", element));

//		longParallelStream = longStream.parallel().parallel().parallel();
//		System.out.println("Long parallel stream after calling parallel() several times: " + longParallelStream);
//
//		longStream = longParallelStream.parallel().parallel().parallel();
//		System.out.println("Long stream after calling sequential() several times: " + longStream);

		System.out.println();

		double[] doubleArray = CollectionFactory.getDoubleArray();
		DoubleStream doubleStream = Arrays.stream(doubleArray);
//		System.out.println(doubleStream);
//		System.out.println("Double parallel stream: " + doubleStream.parallel());
		doubleStream.forEach(element -> System.out.printf("%s\n", element));
	}
}

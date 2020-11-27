package org.javaturk.oofp.ch12.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.javaturk.oofp.ch12.util.StreamUtil.print;

import java.util.*;

public class LazyStreamExample {

	private static int counter;

	public static void main(String[] args) {
//		 runExample1();
//		 runExample2();
//		runExample3();
		 runExample4();
	}

	public static void runExample1() {
		IntStream stream = IntStream.range(1, 5);
		stream = stream.peek(i -> System.out.println("Starting: " + i)).filter(i -> {
			System.out.println("Filtering: " + i);
			return i % 2 == 0;
		}).peek(i -> System.out.println("Post filtering: " + i));
		System.out.println("Invoking terminal method count.");
		System.out.println("The count is " + stream.count());
	}

	public static void runExample2() {
		// No terminal operation!
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		counter = 0;
		Stream<String> stream = list.stream().filter(element -> {
			boolean b = element.contains("2");
			if(b)
				call();
			return b;
		});
//		System.out.println("Counter: " + stream.count());
		System.out.println("Counter: " + counter);
	}

	public static void runExample3() {
		// There is a terminal operation!
		List<String> list = Arrays.asList("abc13", "abc2", "abc3", "def33");
		counter = 0;
		// Stream<String> stream = list.stream().filter(element -> {
		// call();
		// return element.contains("2");
		// });

		// stream.forEach(System.out::println);
		list.stream().filter((s) -> s.endsWith("33")).forEach((s) -> System.out.println("Naberrr"));
		System.out.println("Counter: " + counter);
	}

	public static void runExample4() {
		// To see the effect of lazy evaluation make length something bigger than 5
		int length = 6;
		List<String> list = Stream.of("one", "two", "three", "four").peek(e -> {
			System.out.println("Filtered value: " + e);
			call();
		}).filter(e -> e.length() > length).map(String::toUpperCase).peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		print(list);
		System.out.println("Counter: " + counter);
	}

	private static void call() {
		counter++;
		System.err.println("In call() counter: " + counter);
	}
}

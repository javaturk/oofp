package org.javaturk.oofp.ch12.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class OtherTerminalsExample {

	public static void main(String[] args) {
		String[] s1 = { "one", "two", "three", "four" };

		Optional<String> min = Arrays.stream(s1).min(String::compareTo);
		if (min.isPresent()) {
			System.out.println(min.get());
		}

		Optional<String> max = Arrays.stream(s1).max(String::compareTo);
		if (max.isPresent()) {
			System.out.println(max.get());
		}

		String[] s2 = { "aaaa", "aaa", "a", "aaaaa" };
		String str = Arrays.stream(s2).min(Comparator.comparingInt(String::length)).orElseGet(String::new);
		System.out.println(str);

		String[] s3 = {};
		str = Arrays.stream(s3).min(Comparator.comparingInt(String::length)).orElseGet(() -> "X");
		System.out.println(str);

		double v = LongStream.range(1, 10).average().orElse(-1);
		System.out.println(v);

		LongStream stream1 = LongStream.of(3, 6, 9);
		OptionalDouble average = stream1.average();
		v = average.orElseGet(() -> -1d);
		System.out.println(v);

		System.out.println("--- Matching --- ");
		String[] s4 = { "one", "two", "three", "four", "five", "six", "seven" };

		Stream<String> stream2 = Arrays.stream(s4);
		boolean b = stream2.noneMatch(s -> s.startsWith("z"));
		System.out.println(b);

		Stream<String> stream3 = Arrays.stream(s4);
		boolean b2 = stream3.noneMatch(s -> s.startsWith("f"));
		System.out.println(b2);

		Stream<String> stream4 = Arrays.stream(s4);
		boolean b3 = stream4.anyMatch(s -> s.startsWith("z"));
		System.out.println(b3);

		Stream<String> stream5 = Arrays.stream(s4);
		boolean b4 = stream5.anyMatch(s -> s.startsWith("f") && s.length() >= 4);
		System.out.println(b4);

		Stream<String> stream6 = Arrays.stream(s4);
		boolean b5 = stream6.anyMatch(s -> s.length() >= 5);
		System.out.println(b5);

		Stream<String> stream7 = Arrays.stream(s4);
		boolean b6 = stream7.allMatch(s -> s.length() > 3);
		System.out.println("All match: " + b6);

		Stream<String> stream8 = Arrays.stream(s4);
		boolean b7 = stream8.noneMatch(s -> false);
		System.out.println(b7);

		System.out.println("--- Finding ---");
		Stream<Object> s5 = Stream.empty();
		Optional<Object> opt1 = Optional.of(s5.findFirst().orElseGet(Date::new));
		System.out.println(opt1.isPresent());
		System.out.println(opt1.get());

		System.out.println();
		
		Stream<String> s6 = Stream.of("one", "two", "three", "four");
		Optional<String> opt2 = s6.findFirst();
		if (opt2.isPresent()) {
			System.out.println(opt2.get());
		}

		System.out.println();
		
		Stream<String> s7 = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
		Optional<String> opt3 = s7.parallel().findFirst();
		if (opt3.isPresent()) {
			System.out.println("Parallel findFirst: " + opt3.get());
		}

		System.out.println();
		
		Stream<String> s8 = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
		Optional<String> opt4 = s8.parallel().findAny();
		if (opt4.isPresent()) {
			System.out.println("Parallel findAny: " + opt4.get());

			Arrays.asList("red", "green", "blue").stream().sorted().findFirst().ifPresent(System.out::println);

			Arrays.asList("red", "yellow", "aaa", "blue").stream().sorted().findFirst()
					.ifPresent(System.out::println);
		}
	}
}

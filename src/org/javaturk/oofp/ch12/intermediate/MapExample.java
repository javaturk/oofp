package org.javaturk.oofp.ch12.intermediate;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import static org.javaturk.oofp.ch12.util.StreamUtil.print;

import org.javaturk.oofp.ch12.domain.Book;

import static org.javaturk.oofp.ch12.domain.BookFactory.*;


public class MapExample {
	public static void main(String[] args) {
//		runExamples();
		runBookExamples();
	}

	public static void runExamples() {
		// find the average of the even numbers squared
		System.out.println("Everage of numbers");
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }).filter(x -> x % 2 == 0).map(n -> n * n).average()
				.ifPresent(System.out::println);

		System.out.println("\nMapping doubles to ints");
		// map doubles to ints
		Stream.of(1.5, 2.3, 3.7).mapToInt(Double::intValue).forEach(System.out::println);

		System.out.println("\nMapping doubles to ints");
//		Stream.iterate(1.0, i -> Math.random() < 0.8, i -> 10 * Math.random()).mapToInt(Double::intValue)
//				.forEach(System.out::println);

		System.out.println("\nMapping uppercase");
		List<String> collected = Stream.of("Java", " Rocks").map(string -> string.toUpperCase()).collect(toList());
		System.out.println(collected);
	}

	private static void runBookExamples() {
		// aggregate author first names into a list
		System.out.println("Mapping to author names");
		List<Book> books = getBookList();
		List<String> list = books.stream().map(Book::getAuthorLName).collect(Collectors.toList());
		print(list);
		
		System.out.println("Mapping to author names and filtering");
		list = books.stream().map(Book::getAuthorLName).filter((s) -> s.startsWith("S")).collect(Collectors.toList());
		print(list);
	}
}

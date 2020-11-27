package org.javaturk.oofp.ch12.terminal.reduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static org.javaturk.oofp.ch12.domain.BookFactory.*;
import static org.javaturk.oofp.ch12.domain.CollectionFactory.getNameList;

import org.javaturk.oofp.ch12.domain.Book;

/**
 * This uses: <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,
 * BinaryOperator<U> combiner)
 * 
 * @author akin
 *
 */
public class ReduceExample2 {

	public static void main(String[] args) {
//		runExamples();
//		 runNamesExample();
//		 runNamesMechanism();
		 runBooksExamples();
	}

	public static void runExamples() {
		BinaryOperator<Integer> combiner = (i1, i2) -> {
			System.out.println("combiner: Thread: " + Thread.currentThread().getName());
			System.out.println("i1: " + i1 + " i2: " + i2);
			return i1 + i2;
		};
		BiFunction<Integer, String, Integer> intConverter = (integer, s) -> {
			System.out.println("intConverter: Thread: " + Thread.currentThread().getName());
			System.out.println("integer: " + integer + " s: " + s);
			return Integer.sum(integer, Integer.parseInt(s));
		};
		int result = Stream.of("0", "1", "2", "3").parallel().reduce(0, intConverter, combiner);
//		int result = Stream.of("0", "1", "2", "3", "4", "5", "6", "7").parallel().reduce(0, intConverter, combiner);
		System.out.println(result);

		// This is the same thing
//		int i = Stream.of("2", "3", "4", "5").parallel().reduce(0, new BiFunction<Integer, String, Integer>() {
//			@Override
//			public Integer apply(Integer integer, String s) {
//				return Integer.sum(integer, Integer.parseInt(s));
//			}
//		}, new BinaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer integer, Integer integer2) {
//				return Integer.sum(integer, integer2);
//			}
//		});

//		System.out.println(i);
	}

	public static void runNamesExample() {
		BinaryOperator<Integer> nameLengthCombiner = (i1, i2) -> i1 + i2;
		BiFunction<Integer, String, Integer> nameLengthAccumulator = (nameLength, name) -> nameLength + name.length();
		Integer nameLength = getNameList().stream().reduce(0, nameLengthAccumulator, nameLengthCombiner);
		System.out.println("Length of all names: " + nameLength);

		List<String> nameList = getNameList();
		nameLength = 0;
		for (String name : nameList) {
			System.out.println(name);
			nameLength += name.length();
		}
		System.out.println("Length of all names: " + nameLength);
	}

	public static void runNamesMechanism() {
		BinaryOperator<Integer> nameLengthCombiner = (i1, i2) -> {
			System.out.print("\nBinaryOperator: i1=" + i1 + " i2=" + i2);
			int i3 = i1 + i2;
			System.out.print("Total: " + i3);
			return i3;
		};
		BiFunction<Integer, String, Integer> nameLengthAccumulator = (nameLength, name) -> {
			System.out.println("BiFunction: nameLength=" + nameLength + " name.length()=" + name.length());
			return nameLength + name.length();
		};
		Integer nameLength = getNameList().stream().reduce(0, nameLengthAccumulator, nameLengthCombiner);
		System.out.println("Length of all names: " + nameLength);

		List<String> nameList = getNameList();
		nameLength = 0;
		for (String name : nameList)
			nameLength += name.length();
		System.out.println("Length of all names: " + nameLength);
	}

	public static void runBooksExamples() {
		// In case of parallel streams, this will join the outcomes of parallel streams
		BinaryOperator<String> bookTitlesConcat = (s1, s2) -> {System.out.println("BinaryOperator: " + s1 + " " + s2);return s1 + s2;};
		BiFunction<String, Book, String> titleAccumulator = (titles, book) -> titles
				.concat(book.getTitle().concat("\n"));
		String titles = getBookList().stream().reduce("", titleAccumulator, bookTitlesConcat);
		System.out.println("Titles: \n" + titles);

		// In case or sequential streams
//		titles = getBookList().stream().reduce("Book Titles: \n", titleAccumulator, bookTitlesConcat);
//		System.out.println(titles);
//
		BinaryOperator<Integer> bookPagesAdder = (i1, i2) -> i1 + i2;
		BiFunction<Integer, Book, Integer> pageAccumulator = (sum, book) -> sum + book.getPages();
		int totalPages = getBookList().stream().reduce(0, pageAccumulator, bookPagesAdder);
		System.out.println(totalPages);
//
		List<Book> books = getBookList();
		totalPages = 0;
		for (Book book : books)
			totalPages += book.getPages();
		System.out.println(totalPages);
	}
}

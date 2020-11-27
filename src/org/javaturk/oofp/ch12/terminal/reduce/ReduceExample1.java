package org.javaturk.oofp.ch12.terminal.reduce;

import static org.javaturk.oofp.ch12.domain.CollectionFactory.getNameList;

import java.util.stream.*;
import java.util.function.BinaryOperator;

/**
 * This uses:
 * T reduce(T identity, BinaryOperator<T> accumulator)
 * @author akin
 *
 */
public class ReduceExample1 {

	public static void main(String[] args) {
//		runExamples();
		runNamesExamples();
//		runBooksExamples();
	}
	
	public static void runExamples() {
//		int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (i, j) -> i + j);
//		System.out.println(sum);
		BinaryOperator<Integer> bo = (i, j) -> {System.out.print("i: " + i + " j: " + j); int sum = i + j; System.out.println(" Sum: " + sum); return sum;};
		int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, bo);
		System.out.println(sum);
		
		sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, Integer::sum);
		System.out.println(sum);
		
		int product = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (i, j) -> i * j);
		System.out.println(product);
		
		BinaryOperator<Double> averageOperator = (i, j) -> i + j / 9;
		double average = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0).reduce(0.0, averageOperator);
		System.out.println(average);
	}

	public static void runNamesExamples() {
		BinaryOperator<String> nameConcat = (names, name) -> names.concat(name).concat("-");
		String names = getNameList().stream().reduce("", nameConcat);
		System.out.println("Names: " + names);
	}

	public static void runBooksExamples() {
		// Can't do this in this version of reduce: Get the titles of books as one string
//		BinaryOperator<String> bookTitlesConcat = (titles, Book::getTitle) ->  titles.concat(title).concat("\n");
//		String titles = getBookList().stream().reduce("Book Titles:\n", bookTitlesConcat);
		
//		Can't do this in this version of reduce: Get the sum of the pages of the books
//		BinaryOperator<Integer> bookPagesAdder = (sum, page) -> sum += page;
//		Integer totalPages = getBookList().stream().reduce(0, Book::getPages);
	}
}

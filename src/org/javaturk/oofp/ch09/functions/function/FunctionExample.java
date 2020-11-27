package org.javaturk.oofp.ch09.functions.function;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.javaturk.oofp.ch09.domain.Book;
import org.javaturk.oofp.ch09.domain.BookFactory;

public class FunctionExample {

	public static void main(String... args) {
//		functionExample();
		identityExample();
	}

	public static void functionExample() {
		Function<Integer, String> converter = num -> Integer.toString(num);
		System.out.println("length of 17423426: " + converter.apply(17423426).length());

		System.out.println();

		Function<Integer, Integer> square = num -> num * num;
		System.out.println(square.apply(3));

		System.out.println();

		Function<Integer, Double> squared = num -> Math.sqrt(num);
		System.out.println("5 squared: " + squared.apply(5));

		System.out.println();

		Function<Integer, Boolean> isEven = num -> num % 2 == 0;
		System.out.println(isEven.apply(3));
		System.out.println(isEven.apply(4));

//		Predicate<Integer> isEvenPredicate = num -> num % 2 == 0;
//		System.out.println(isEvenPredicate.test(3));
//		System.out.println(isEvenPredicate.test(4));

		System.out.println();

		Function<Integer[], Integer> arrayLengthMeasurer = array -> array.length;
		System.out.println(arrayLengthMeasurer.apply(new Integer[] { 43, 25, 99, 5 }));

		Function<Integer[], String[]> intStringConverterIn10Chars = array -> {
			int length = array.length;
			String[] strings = new String[length];
			for (int i = 0; i < length; i++) {
				String s = array[i].toString();
				int diff = 10 - s.length();
				if (diff > 0)
					for (int j = 0; j < diff; j++)
						s = "0".concat(s);
				strings[i] = s;
			}
			return strings;
		};

		System.out.println();

		String[] strings = intStringConverterIn10Chars.apply(new Integer[] { 2129, 43, 25, 99, 1234567890 });
		for (String s : strings)
			System.out.println(s);

		System.out.println();

		Function<List<Book>, Integer[]> bookPageCountConverter = books -> {
			int size = books.size();
			Integer[] pages = new Integer[size];
			for (int i = 0; i < size; i++)
				pages[i] = books.get(i).getPages();
			return pages;
		};

		List<Book> bookList = BookFactory.getBookList();
		Integer[] pages = bookPageCountConverter.apply(bookList);
		System.out.println("\nNumber of Pages");
		for (int page : pages)
			System.out.println(page);
	}

	public static void identityExample() {
		Function<Book, Book> identityLambdaExpression = Function.identity();

		Book book = new Book("The Cat in the Hat", "Dr", "Seuss", 450);
		Book aNewBook = identityLambdaExpression.apply(book);
		System.out.println(book);
		System.out.println(aNewBook);
		System.out.println(book == aNewBook);
	}
}

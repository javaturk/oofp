package org.javaturk.oofp.ch12.intermediate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.javaturk.oofp.ch12.domain.Book;

import static org.javaturk.oofp.ch12.domain.CollectionFactory.*;
import static org.javaturk.oofp.ch12.util.StreamUtil.print;
import static org.javaturk.oofp.ch12.domain.BookFactory.*;

public class FilterExample {

	public static void main(String[] args) {
//		runNamesExamples();
		runBooksExamples();
	}

	public static void runNamesExamples() {
		Predicate<String> lengthPredicate = s -> s.length() < 5;

		List<String> nameList = getNameList();
		print(nameList);

//		System.out.println("Length predicate");
//		Stream<String> stream = nameList.stream();
//		stream = stream.filter(lengthPredicate);
//		print(stream);

		List<String> duplicatedNameList = getDuplicatedNameList();
		print(duplicatedNameList);

		System.out.println("Length predicate");
		Stream<String> stream = duplicatedNameList.stream();
		stream = stream.distinct().filter(lengthPredicate);
		print(stream);
	}

	public static void runBooksExamples() {
		List<Book> books = getBookList();
		Predicate<Book> bookNameFirstCharPredicate = (b) -> b.getTitle().startsWith("C");
		Predicate<Book> bookPagePredicate = (b) -> b.getPages() > 600;
		
		System.out.println("\nbookNameFirstCharPredicate");
		books.stream().filter(bookNameFirstCharPredicate).forEach(b -> System.out.println(b.getTitle() + " " + b.getPages()));
	
		System.out.println("\nbookPagePredicate");
		books.stream().filter(bookPagePredicate).forEach(b -> System.out.println(b.getTitle() + " " + b.getPages()));
	
		System.out.println("\nbookPagePredicate & bookNameFirstCharPredicate");
		books.stream().filter(bookPagePredicate).filter(bookNameFirstCharPredicate).forEach(b -> System.out.println(b.getTitle() + " " + b.getPages()));
		long count = books.stream().filter(bookPagePredicate).filter(bookNameFirstCharPredicate).count();
		System.out.println("Count: " + count);
	}
}
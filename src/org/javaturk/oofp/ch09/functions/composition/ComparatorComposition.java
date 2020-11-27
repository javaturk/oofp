package org.javaturk.oofp.ch09.functions.composition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.javaturk.oofp.ch09.domain.Book;
import org.javaturk.oofp.ch09.domain.BookFactory;

public class ComparatorComposition {

	public static void main(String[] args) {
		List<Book> books = init();
		
		books.forEach(book -> System.out.print(book));
	
		System.out.println();
		
		System.out.println("\nAfter sorting alphabetically.");
		Collections.sort(books);
		books.forEach(book -> System.out.print(book));
		
		System.out.println("\nAfter sorting alphabetically");
		Comparator<Book> compareByTitle = (b1, b2) -> b1.getTitle().compareTo(b2.getTitle());
		Collections.sort(books, compareByTitle);
		for(Book b : books)
			System.out.print(b);
		
		System.out.println("\nAfter sorting by author lastname.");
		Comparator<Book> compareByAuthorLastName = (b1, b2) -> b1.getAuthorLName().compareTo(b2.getAuthorLName());
		Collections.sort(books, compareByAuthorLastName);
		for(Book b : books)
			System.out.print(b);
		
		System.out.println("\nAfter sorting by author lastname in reverse.");
		Collections.sort(books, compareByAuthorLastName.reversed());
		for(Book b : books)
			System.out.print(b);
		
		System.out.println("\nAfter sorting by page count.");
		Comparator<Book> compareByPageCount = (b1, b2) -> b1.getPages() - b2.getPages();
		Collections.sort(books, compareByPageCount);
		for(Book b : books)
			System.out.print(b);
		
		System.out.println("\nAfter sorting by first title and then by author lastname.");
		Comparator<Book> compareTitleAndThenByAuthorLastName = compareByTitle.thenComparing(compareByAuthorLastName);
		Collections.sort(books, compareTitleAndThenByAuthorLastName);
		for(Book b : books)
			System.out.print(b);
		
		System.out.println("\nAfter sorting by first title and then by author lastname and then by page count.");
		Comparator<Book> compareTitleAndThenByAuthorLastNameAndThenByPageCount = compareByTitle.thenComparing(compareByAuthorLastName).thenComparing(compareByPageCount);
		Collections.sort(books, compareTitleAndThenByAuthorLastNameAndThenByPageCount);
		for(Book b : books)
			System.out.print(b);
	}
	
	private static List<Book> init(){
		return BookFactory.getBookList();
	}
}

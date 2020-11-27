package org.javaturk.oofp.ch09.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookFactory {
	
	public static List<Book> getBookList(){
		List<Book> books = new ArrayList<>();
		books.add(new Book("The Cat in the Hat", "Dr", "Seuss", 450));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382));
		books.add(new Book("Java Tutorial", "Mark", "Randall", 717));
		books.add(new Book("Java Lambdas", "John", "Maguire", 182));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 888));
		books.add(new Book("Clean Code", "Robert C.", "Martin", 450));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 420));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 400));
		books.add(new Book("Effective Java", "Joshua", "Bloch", 717));
		books.add(new Book("Design Patterns", "Eric", "Gamma", 450));
		books.add(new Book("Refactoring", "Martin", "Fowler", 982));
		books.add(new Book("Refactoring", "Martin", "Fowler", 981));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 999));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 777));
		books.add(new Book("C++ reference", "Herbert", "Cchildt", 777));
		return books;
	}
	
	public static Set<Book> getBookSet(){
		Set<Book> books = new HashSet<>();
		books.add(new Book("The Cat in the Hat", "Dr", "Seuss", 450));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 411));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382));
		books.add(new Book("Java Tutorial", "Mark", "Randall", 717));
		books.add(new Book("Java Lambdas", "John", "Maguire", 182));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 982));
		books.add(new Book("Clean Code", "Robert C.", "Martin", 450));
		books.add(new Book("Harry Potter and The Sorcerers Stone", "JK", "Rowling", 420));
		books.add(new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 400));
		books.add(new Book("Effective Java", "Joshua", "Bloch", 717));
		books.add(new Book("Design Patterns", "Eric", "Gamma", 450));
		books.add(new Book("Refactoring", "Martin", "Fowler", 982));
		books.add(new Book("C++ reference", "Herbert", "Shildt", 982));
		books.add(new Book("C++ reference", "Herbert", "Schildt", 882));
		return books;
	}
}
